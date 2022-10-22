package typingsJapgolly.ckeditor4.global.CKEDITOR

import typingsJapgolly.ckeditor4.CKEDITOR.style.customHandler
import typingsJapgolly.ckeditor4.CKEDITOR.style.definition
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CKEDITOR.style")
@js.native
open class style protected ()
  extends StObject
     with typingsJapgolly.ckeditor4.CKEDITOR.style {
  def this(styleDefinition: definition) = this()
  def this(styleDefinition: definition, variableValues: Record[String, String]) = this()
}
object style {
  
  @JSGlobal("CKEDITOR.style")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addCustomHandler(defintion: customHandler): typingsJapgolly.ckeditor4.CKEDITOR.style = ^.asInstanceOf[js.Dynamic].applyDynamic("addCustomHandler")(defintion.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ckeditor4.CKEDITOR.style]
  
  object customHandlers {
    
    @JSGlobal("CKEDITOR.style.customHandlers.widget")
    @js.native
    open class widget ()
      extends StObject
         with typingsJapgolly.ckeditor4.CKEDITOR.style.customHandlers.widget
  }
  
  inline def getStyleText(style: definition): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyleText")(style.asInstanceOf[js.Any]).asInstanceOf[String]
}
