package geo.domain

import java.awt.Point

/**
 * @author Paulius Imbrasas
 * @author Oliver Lea
 */
class GPoint(val x: Double, val y: Double) {

  def this(p: Point) = this(p.getX, p.getY)

  def +(p: (Double, Double)) = {
    new GPoint(x + p._1, y + p._2)
  }

  def +(a: Velocity) = {
    new GPoint(x + a.dx, y + a.dy)
  }

  def -(p: (Double, Double)) = {
    new GPoint(x - p._1, y - p._2)
  }

  def -(p: GPoint): GPoint = {
    new GPoint(x - p.x, y - p.y)
  }

  def -(a: Velocity) = {
    new GPoint(x - a.dx, y - a.dy)
  }

  def roundX: Int = math.round(x).toInt
  def roundY: Int = math.round(y).toInt

  override def toString: String = s"[$x, $y]"
}
