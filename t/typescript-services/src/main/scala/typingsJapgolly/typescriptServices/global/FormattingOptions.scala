package typingsJapgolly.typescriptServices.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("FormattingOptions")
@js.native
open class FormattingOptions protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.FormattingOptions {
  def this(useTabs: Boolean, spacesPerTab: Double, indentSpaces: Double, newLineCharacter: String) = this()
  
  /* CompleteClass */
  var indentSpaces: Double = js.native
  
  /* CompleteClass */
  var newLineCharacter: String = js.native
  
  /* CompleteClass */
  var spacesPerTab: Double = js.native
  
  /* CompleteClass */
  var useTabs: Boolean = js.native
}
object FormattingOptions {
  
  @JSGlobal("FormattingOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("FormattingOptions.defaultOptions")
  @js.native
  def defaultOptions: typingsJapgolly.typescriptServices.FormattingOptions = js.native
  inline def defaultOptions_=(x: typingsJapgolly.typescriptServices.FormattingOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
}
