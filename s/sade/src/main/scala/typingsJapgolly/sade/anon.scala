package typingsJapgolly.sade

import japgolly.scalajs.react.Callback
import typingsJapgolly.mri.mod.Dict
import typingsJapgolly.sade.mod.Arrayable
import typingsJapgolly.sade.sadeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Alias extends StObject {
    
    var default: js.UndefOr[Boolean] = js.undefined
    
    var alias: js.UndefOr[Arrayable[String]] = js.undefined
  }
  object Alias {
    
    inline def apply(): Alias = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Alias]
    }
    
    extension [Self <: Alias](x: Self) {
      
      inline def setAlias(value: Arrayable[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value*))
      
      inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    }
  }
  
  /* Inlined {  lazy :boolean | undefined} & mri.mri.Options */
  trait lazybooleanundefinedOptio extends StObject {
    
    var default: js.UndefOr[Dict[Any]] = js.undefined
    
    var alias: js.UndefOr[Dict[typingsJapgolly.mri.mod.Arrayable[String]]] = js.undefined
    
    var boolean: js.UndefOr[typingsJapgolly.mri.mod.Arrayable[String]] = js.undefined
    
    var `lazy`: js.UndefOr[Boolean] = js.undefined
    
    var string: js.UndefOr[typingsJapgolly.mri.mod.Arrayable[String]] = js.undefined
    
    var unknown: js.UndefOr[js.Function1[/* flag */ String, Unit]] = js.undefined
  }
  object lazybooleanundefinedOptio {
    
    inline def apply(): lazybooleanundefinedOptio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[lazybooleanundefinedOptio]
    }
    
    extension [Self <: lazybooleanundefinedOptio](x: Self) {
      
      inline def setAlias(value: Dict[typingsJapgolly.mri.mod.Arrayable[String]]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setBoolean(value: typingsJapgolly.mri.mod.Arrayable[String]): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      inline def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      inline def setBooleanVarargs(value: String*): Self = StObject.set(x, "boolean", js.Array(value*))
      
      inline def setDefault(value: Dict[Any]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      inline def setString(value: typingsJapgolly.mri.mod.Arrayable[String]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      inline def setStringVarargs(value: String*): Self = StObject.set(x, "string", js.Array(value*))
      
      inline def setUnknown(value: /* flag */ String => Callback): Self = StObject.set(x, "unknown", js.Any.fromFunction1((t0: /* flag */ String) => value(t0).runNow()))
      
      inline def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
    }
  }
  
  /* Inlined {  lazy :true} & mri.mri.Options */
  trait lazytrueOptions extends StObject {
    
    var default: js.UndefOr[Dict[Any]] = js.undefined
    
    var alias: js.UndefOr[Dict[typingsJapgolly.mri.mod.Arrayable[String]]] = js.undefined
    
    var boolean: js.UndefOr[typingsJapgolly.mri.mod.Arrayable[String]] = js.undefined
    
    var `lazy`: `true`
    
    var string: js.UndefOr[typingsJapgolly.mri.mod.Arrayable[String]] = js.undefined
    
    var unknown: js.UndefOr[js.Function1[/* flag */ String, Unit]] = js.undefined
  }
  object lazytrueOptions {
    
    inline def apply(): lazytrueOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("lazy")(true)
      __obj.asInstanceOf[lazytrueOptions]
    }
    
    extension [Self <: lazytrueOptions](x: Self) {
      
      inline def setAlias(value: Dict[typingsJapgolly.mri.mod.Arrayable[String]]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setBoolean(value: typingsJapgolly.mri.mod.Arrayable[String]): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      inline def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      inline def setBooleanVarargs(value: String*): Self = StObject.set(x, "boolean", js.Array(value*))
      
      inline def setDefault(value: Dict[Any]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setLazy(value: `true`): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setString(value: typingsJapgolly.mri.mod.Arrayable[String]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      inline def setStringVarargs(value: String*): Self = StObject.set(x, "string", js.Array(value*))
      
      inline def setUnknown(value: /* flag */ String => Callback): Self = StObject.set(x, "unknown", js.Any.fromFunction1((t0: /* flag */ String) => value(t0).runNow()))
      
      inline def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
    }
  }
}
