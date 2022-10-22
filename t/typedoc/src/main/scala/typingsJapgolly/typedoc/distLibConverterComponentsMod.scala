package typingsJapgolly.typedoc

import typingsJapgolly.std.ClassDecorator
import typingsJapgolly.typedoc.distLibConverterConverterMod.Converter
import typingsJapgolly.typedoc.distLibUtilsComponentMod.AbstractComponent
import typingsJapgolly.typedoc.distLibUtilsComponentMod.ComponentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibConverterComponentsMod {
  
  @JSImport("typedoc/dist/lib/converter/components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Component(options: ComponentOptions): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Component")(options.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
  
  /* note: abstract class */ @JSImport("typedoc/dist/lib/converter/components", "ConverterComponent")
  @js.native
  open class ConverterComponent protected () extends AbstractComponent[Converter] {
    /**
      * Create new Component instance.
      */
    def this(owner: Converter) = this()
  }
}
