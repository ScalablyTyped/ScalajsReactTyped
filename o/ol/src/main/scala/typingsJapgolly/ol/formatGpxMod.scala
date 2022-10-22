package typingsJapgolly.ol

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatGpxMod {
  
  @JSImport("ol/format/GPX", JSImport.Default)
  @js.native
  open class default () extends GPX {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait GPX
    extends typingsJapgolly.ol.formatXmlfeatureMod.default
  
  trait LayoutOptions extends StObject {
    
    var hasM: js.UndefOr[Boolean] = js.undefined
    
    var hasZ: js.UndefOr[Boolean] = js.undefined
  }
  object LayoutOptions {
    
    inline def apply(): LayoutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutOptions]
    }
    
    extension [Self <: LayoutOptions](x: Self) {
      
      inline def setHasM(value: Boolean): Self = StObject.set(x, "hasM", value.asInstanceOf[js.Any])
      
      inline def setHasMUndefined: Self = StObject.set(x, "hasM", js.undefined)
      
      inline def setHasZ(value: Boolean): Self = StObject.set(x, "hasZ", value.asInstanceOf[js.Any])
      
      inline def setHasZUndefined: Self = StObject.set(x, "hasZ", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var readExtensions: js.UndefOr[
        js.Function2[
          /* p0 */ typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default], 
          /* p1 */ Node, 
          Unit
        ]
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setReadExtensions(
        value: (/* p0 */ typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default], /* p1 */ Node) => Callback
      ): Self = StObject.set(x, "readExtensions", js.Any.fromFunction2((t0: /* p0 */ typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default], t1: /* p1 */ Node) => (value(t0, t1)).runNow()))
      
      inline def setReadExtensionsUndefined: Self = StObject.set(x, "readExtensions", js.undefined)
    }
  }
}
