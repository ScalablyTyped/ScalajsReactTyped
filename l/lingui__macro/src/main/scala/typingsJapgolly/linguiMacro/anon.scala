package typingsJapgolly.linguiMacro

import typingsJapgolly.linguiCore.cjsI18nMod.MessageDescriptor
import typingsJapgolly.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(descriptor: MessageDescriptor): String = js.native
    def apply(literals: TemplateStringsArray, placeholders: Any*): String = js.native
  }
}
