package typingsJapgolly.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Location")
@js.native
open class Location protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.Location {
  def this(
    fileName: String,
    lineMap: typingsJapgolly.typescriptServices.TypeScript.LineMap,
    start: Double,
    length: Double
  ) = this()
  
  /* private */ /* CompleteClass */
  var _fileName: Any = js.native
  
  /* private */ /* CompleteClass */
  var _length: Any = js.native
  
  /* private */ /* CompleteClass */
  var _lineMap: Any = js.native
  
  /* private */ /* CompleteClass */
  var _start: Any = js.native
  
  /* CompleteClass */
  override def character(): Double = js.native
  
  /* CompleteClass */
  override def fileName(): String = js.native
  
  /* CompleteClass */
  override def length(): Double = js.native
  
  /* CompleteClass */
  override def line(): Double = js.native
  
  /* CompleteClass */
  override def lineMap(): typingsJapgolly.typescriptServices.TypeScript.LineMap = js.native
  
  /* CompleteClass */
  override def start(): Double = js.native
}
object Location {
  
  @JSImport("typescript-services", "Location")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def equals_(
    location1: typingsJapgolly.typescriptServices.TypeScript.Location,
    location2: typingsJapgolly.typescriptServices.TypeScript.Location
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(location1.asInstanceOf[js.Any], location2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
