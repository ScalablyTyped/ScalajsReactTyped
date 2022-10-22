package typingsJapgolly.reactPopper

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactPopper.mod.Modifier
import typingsJapgolly.reactPopper.mod.StrictModifierNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[Name /* <: StrictModifierNames */] extends StObject {
    
    var name: js.UndefOr[Name] = js.undefined
  }
  object `0` {
    
    inline def apply[Name /* <: StrictModifierNames */](): `0`[Name] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`[Name]]
    }
    
    extension [Self <: `0`[?], Name /* <: StrictModifierNames */](x: Self & `0`[Name]) {
      
      inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait Attributes extends StObject {
    
    var attributes: StringDictionary[js.UndefOr[StringDictionary[String]]]
    
    var forceUpdate: (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Instance * / any['forceUpdate'] */ js.Any) | Null
    
    var state: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.State */ Any) | Null
    
    var styles: StringDictionary[CSSProperties]
    
    var update: (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Instance * / any['update'] */ js.Any) | Null
  }
  object Attributes {
    
    inline def apply(
      attributes: StringDictionary[js.UndefOr[StringDictionary[String]]],
      styles: StringDictionary[CSSProperties]
    ): Attributes = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], forceUpdate = null, state = null, update = null)
      __obj.asInstanceOf[Attributes]
    }
    
    extension [Self <: Attributes](x: Self) {
      
      inline def setAttributes(value: StringDictionary[js.UndefOr[StringDictionary[String]]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setForceUpdate(
        value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Instance * / any['forceUpdate'] */ js.Any
      ): Self = StObject.set(x, "forceUpdate", value.asInstanceOf[js.Any])
      
      inline def setForceUpdateNull: Self = StObject.set(x, "forceUpdate", null)
      
      inline def setState(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.State */ Any
      ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateNull: Self = StObject.set(x, "state", null)
      
      inline def setStyles(value: StringDictionary[CSSProperties]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setUpdate(
        value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Instance * / any['update'] */ js.Any
      ): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateNull: Self = StObject.set(x, "update", null)
    }
  }
  
  trait CreatePopper[Modifiers] extends StObject {
    
    var createPopper: js.UndefOr[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PopperJS.createPopper */ Any
      ] = js.undefined
    
    var modifiers: js.UndefOr[js.Array[Modifier[Modifiers, js.Object]]] = js.undefined
  }
  object CreatePopper {
    
    inline def apply[Modifiers](): CreatePopper[Modifiers] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreatePopper[Modifiers]]
    }
    
    extension [Self <: CreatePopper[?], Modifiers](x: Self & CreatePopper[Modifiers]) {
      
      inline def setCreatePopper(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PopperJS.createPopper */ Any
      ): Self = StObject.set(x, "createPopper", value.asInstanceOf[js.Any])
      
      inline def setCreatePopperUndefined: Self = StObject.set(x, "createPopper", js.undefined)
      
      inline def setModifiers(value: js.Array[Modifier[Modifiers, js.Object]]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      inline def setModifiersVarargs(value: (Modifier[Modifiers, js.Object])*): Self = StObject.set(x, "modifiers", js.Array(value*))
    }
  }
}
