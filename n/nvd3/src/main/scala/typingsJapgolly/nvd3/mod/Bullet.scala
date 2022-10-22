package typingsJapgolly.nvd3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bullet
  extends StObject
     with Nvd3Element {
  
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(func: js.Function2[/* d */ Any, /* i */ Double, String]): this.type = js.native
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(value: js.Array[String]): this.type = js.native
  
  /*List of numbers to Force into the X scale (ie. 0, or a max / min, etc.). This ensures the numbers are in the X domain but doesn't override the whole domain. This option only applies if you have not overridden the whole domain with the xDomain option*/
  def forceX(): js.Array[Double] = js.native
  /*List of numbers to Force into the X scale (ie. 0, or a max / min, etc.). This ensures the numbers are in the X domain but doesn't override the whole domain. This option only applies if you have not overridden the whole domain with the xDomain option*/
  def forceX(value: js.Array[Double]): this.type = js.native
  
  /*The height the graph or component created inside the SVG should be made*/
  def height(): Double = js.native
  /*The height the graph or component created inside the SVG should be made.*/
  def height(value: Double): this.type = js.native
  
  /*Object containing the margins for the chart or component. You can specify only certain margins in the object to change just those parts.*/
  def margin(): Margin = js.native
  /*Object containing the margins for the chart or component. You can specify only certain margins in the object to change just those parts.*/
  def margin(value: Margin): this.type = js.native
  
  def markers(): js.Function1[/* d */ Any, Any] = js.native
  //todo;
  def markers(func: js.Function1[/* d */ Any, Any]): this.type = js.native
  
  //todo;
  def measures(): js.Function1[/* d */ Any, Any] = js.native
  //todo;
  def measures(func: js.Function1[/* d */ Any, Any]): this.type = js.native
  
  //todo;
  def orient(): String = js.native
  def orient(orientation: String): this.type = js.native
  
  def ranges(): js.Function1[/* d */ Any, Any] = js.native
  //todo;
  def ranges(func: js.Function1[/* d */ Any, Any]): this.type = js.native
  
  //todo;
  def tickFormat(): js.Function1[/* d */ Any, String] = js.native
  def tickFormat(format: String): this.type = js.native
  def tickFormat(format: js.Function1[/* d */ Any, String]): this.type = js.native
  def tickFormat(format: js.Function2[/* d */ Any, /* i */ Any, String]): this.type = js.native
  
  /* The width the graph or component created inside the SVG should be made*/
  def width(): Double = js.native
  /*The width the graph or component created inside the SVG should be made.*/
  def width(value: Double): this.type = js.native
}
