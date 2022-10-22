package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.distLibConverterComponentsMod.ConverterComponent
import typingsJapgolly.typedoc.distLibConverterConverterMod.Converter
import typingsJapgolly.typedoc.distLibConverterMod.Context
import typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ValidationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibConverterPluginsLinkResolverPluginMod {
  
  @JSImport("typedoc/dist/lib/converter/plugins/LinkResolverPlugin", "LinkResolverPlugin")
  @js.native
  open class LinkResolverPlugin protected () extends ConverterComponent {
    /**
      * Create new Component instance.
      */
    def this(owner: Converter) = this()
    
    def onResolve(context: Context): Unit = js.native
    
    var validation: ValidationOptions = js.native
  }
}
