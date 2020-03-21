package typingsJapgolly.extjs.Ext.draw

import typingsJapgolly.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.draw.Color")
@js.native
class Color () extends js.Object

/* static members */
@JSGlobal("Ext.draw.Color")
@js.native
object Color extends js.Object {
  /** [Method] Add methods  properties to the prototype of this class
  		* @param members Object
  		*/
  def addMembers(): Unit = js.native
  def addMembers(members: js.Any): Unit = js.native
  /** [Method] Add  override static properties of this class
  		* @param members Object
  		* @returns Ext.Base this
  		*/
  def addStatics(): IBase = js.native
  def addStatics(members: js.Any): IBase = js.native
  /** [Method] Create a new instance of this Class
  		* @returns Object the created instance.
  		*/
  def create(): js.Any = js.native
  /** [Method] Create aliases for existing prototype methods
  		* @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
  		* @param origin String/Object The original method name
  		*/
  def createAlias(): Unit = js.native
  def createAlias(alias: js.Any): Unit = js.native
  def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
  /** [Method] Create a new color based on the specified HSL values
  		* @param h Number Hue component (0..359)
  		* @param s Number Saturation component (0..1)
  		* @param l Number Lightness component (0..1)
  		* @returns Object Ext.draw.Color
  		*/
  def fromHSL(): js.Any = js.native
  def fromHSL(h: Double): js.Any = js.native
  def fromHSL(h: Double, s: Double): js.Any = js.native
  def fromHSL(h: Double, s: Double, l: Double): js.Any = js.native
  /** [Method] Parse the string and create a new color
  		* @param str String Color in string.
  		* @returns Object Ext.draw.Color
  		*/
  def fromString(): js.Any = js.native
  def fromString(str: String): js.Any = js.native
  /** [Method] Get the current class name in string format
  		* @returns String className
  		*/
  def getName(): String = js.native
  /** [Method] Adds members to class  */
  def implement(): Unit = js.native
  /** [Method] Override members of this class
  		* @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
  		* @returns Ext.Base this class
  		*/
  def `override`(): IBase = js.native
  def `override`(members: js.Any): IBase = js.native
  /** [Method] Convert a color to hexadecimal format
  		* @param color String/String[] The color value (i.e 'rgb(255, 255, 255)', 'color: #ffffff'). Can also be an Array, in this case the function handles the first member.
  		* @returns String The color in hexadecimal format.
  		*/
  def toHex(): String = js.native
  def toHex(color: js.Any): String = js.native
}

