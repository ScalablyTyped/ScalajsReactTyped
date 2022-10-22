package typingsJapgolly.aframe.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.aframe.mod.Schema_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<aframe.aframe.Shader> */
trait PartialShader extends StObject {
  
  var data: js.UndefOr[js.Object] = js.undefined
  
  var fragmentShader: js.UndefOr[String] = js.undefined
  
  var init: js.UndefOr[
    js.Function1[
      /* data */ js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ js.Any
      ], 
      Unit
    ]
  ] = js.undefined
  
  var material: js.UndefOr[typingsJapgolly.three.mod.Material] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var schema: js.UndefOr[
    Schema_[
      /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ js.Any
    ]
  ] = js.undefined
  
  var tick: js.UndefOr[js.Function2[/* time */ Double, /* timeDelta */ Double, Unit]] = js.undefined
  
  var update: js.UndefOr[
    js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ /* oldData */ js.Any, 
      Unit
    ]
  ] = js.undefined
  
  var vertexShader: js.UndefOr[String] = js.undefined
}
object PartialShader {
  
  inline def apply(): PartialShader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialShader]
  }
  
  extension [Self <: PartialShader](x: Self) {
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFragmentShader(value: String): Self = StObject.set(x, "fragmentShader", value.asInstanceOf[js.Any])
    
    inline def setFragmentShaderUndefined: Self = StObject.set(x, "fragmentShader", js.undefined)
    
    inline def setInit(
      value: /* data */ js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ js.Any
        ] => Callback
    ): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: /* data */ js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ js.Any
        ]) => value(t0).runNow()))
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setMaterial(value: typingsJapgolly.three.mod.Material): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSchema(
      value: Schema_[
          /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ js.Any
        ]
    ): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setTick(value: (/* time */ Double, /* timeDelta */ Double) => Callback): Self = StObject.set(x, "tick", js.Any.fromFunction2((t0: /* time */ Double, t1: /* timeDelta */ Double) => (value(t0, t1)).runNow()))
    
    inline def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
    
    inline def setUpdate(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ /* oldData */ js.Any => Callback
    ): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ /* oldData */ js.Any) => value(t0).runNow()))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    inline def setVertexShader(value: String): Self = StObject.set(x, "vertexShader", value.asInstanceOf[js.Any])
    
    inline def setVertexShaderUndefined: Self = StObject.set(x, "vertexShader", js.undefined)
  }
}
