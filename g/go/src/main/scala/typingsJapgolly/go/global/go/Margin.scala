package typingsJapgolly.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Margin represents a band of space outside or inside a rectangular area,
  * with possibly different values on each of the four sides.
  */
@JSGlobal("go.Margin")
@js.native
/**
  * If zero arguments are supplied, zero is used for all four sides.
  */
open class Margin ()
  extends typingsJapgolly.go.mod.Margin {
  /**
    * If one argument is supplied, that number is used for all four sides.
    * @param {number} m the margin for all four sides.
    */
  def this(m: Double) = this()
  /**
    * If two arguments are supplied, the top and bottom sides get the first value,
    * and the left and right sides get the second value.
    * @param {number} tb the margin for the top and bottom sides
    * @param {number} rl the margin for the right and left sides
    */
  def this(tb: Double, rl: Double) = this()
  /**
    * If there are four arguments, the numbers represent: top, right, bottom, left.
    * @param {number} t the margin for the top side;
    *                    if not supplied, all sides are zero.
    * @param {number} r the margin for the right side;
    *                    if not supplied, all sides have the value of the first argument.
    * @param {number} b the margin for all bottom side;
    *                    if not supplied, the top and bottom get the value of the first argument,
    *                    and the right and left sides get the value of the second argument.
    * @param {number} l the margin for the left side;
    *                    must be supplied if the third argument was supplied.
    */
  def this(t: Double, r: Double, b: Double, l: Double) = this()
}
object Margin {
  
  @JSGlobal("go.Margin")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This static function can be used to read in a Margin from a string that was produced by Margin.stringify.
    * @param {string} str
    */
  /* static member */
  inline def parse(str: String): typingsJapgolly.go.mod.Margin = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.go.mod.Margin]
  
  /**
    * This static function can be used to write out a Margin as a string that can be read by Margin.parse.
    * @param {Margin} val
    */
  /* static member */
  inline def stringify(`val`: typingsJapgolly.go.mod.Margin): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
}
