package typingsJapgolly.webpackMerge

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  @js.native
  sealed trait CustomizeRule extends StObject
  @JSImport("webpack-merge/dist/types", "CustomizeRule")
  @js.native
  object CustomizeRule extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CustomizeRule & String] = js.native
    
    @js.native
    sealed trait Append
      extends StObject
         with CustomizeRule
    /* "append" */ val Append: typingsJapgolly.webpackMerge.distTypesMod.CustomizeRule.Append & String = js.native
    
    @js.native
    sealed trait Match
      extends StObject
         with CustomizeRule
    /* "match" */ val Match: typingsJapgolly.webpackMerge.distTypesMod.CustomizeRule.Match & String = js.native
    
    @js.native
    sealed trait Merge
      extends StObject
         with CustomizeRule
    /* "merge" */ val Merge: typingsJapgolly.webpackMerge.distTypesMod.CustomizeRule.Merge & String = js.native
    
    @js.native
    sealed trait Prepend
      extends StObject
         with CustomizeRule
    /* "prepend" */ val Prepend: typingsJapgolly.webpackMerge.distTypesMod.CustomizeRule.Prepend & String = js.native
    
    @js.native
    sealed trait Replace
      extends StObject
         with CustomizeRule
    /* "replace" */ val Replace: typingsJapgolly.webpackMerge.distTypesMod.CustomizeRule.Replace & String = js.native
  }
  
  type Customize = js.Function3[/* a */ Any, /* b */ Any, /* key */ Key, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.webpackMerge.webpackMergeStrings.`match`
    - typingsJapgolly.webpackMerge.webpackMergeStrings.merge
    - typingsJapgolly.webpackMerge.webpackMergeStrings.append
    - typingsJapgolly.webpackMerge.webpackMergeStrings.prepend
    - typingsJapgolly.webpackMerge.webpackMergeStrings.replace
  */
  trait CustomizeRuleString extends StObject
  object CustomizeRuleString {
    
    inline def append: typingsJapgolly.webpackMerge.webpackMergeStrings.append = "append".asInstanceOf[typingsJapgolly.webpackMerge.webpackMergeStrings.append]
    
    inline def `match`: typingsJapgolly.webpackMerge.webpackMergeStrings.`match` = "match".asInstanceOf[typingsJapgolly.webpackMerge.webpackMergeStrings.`match`]
    
    inline def merge: typingsJapgolly.webpackMerge.webpackMergeStrings.merge = "merge".asInstanceOf[typingsJapgolly.webpackMerge.webpackMergeStrings.merge]
    
    inline def prepend: typingsJapgolly.webpackMerge.webpackMergeStrings.prepend = "prepend".asInstanceOf[typingsJapgolly.webpackMerge.webpackMergeStrings.prepend]
    
    inline def replace: typingsJapgolly.webpackMerge.webpackMergeStrings.replace = "replace".asInstanceOf[typingsJapgolly.webpackMerge.webpackMergeStrings.replace]
  }
  
  trait ICustomizeOptions extends StObject {
    
    var customizeArray: js.UndefOr[Customize] = js.undefined
    
    var customizeObject: js.UndefOr[Customize] = js.undefined
  }
  object ICustomizeOptions {
    
    inline def apply(): ICustomizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICustomizeOptions]
    }
    
    extension [Self <: ICustomizeOptions](x: Self) {
      
      inline def setCustomizeArray(value: (/* a */ Any, /* b */ Any, /* key */ Key) => Any): Self = StObject.set(x, "customizeArray", js.Any.fromFunction3(value))
      
      inline def setCustomizeArrayUndefined: Self = StObject.set(x, "customizeArray", js.undefined)
      
      inline def setCustomizeObject(value: (/* a */ Any, /* b */ Any, /* key */ Key) => Any): Self = StObject.set(x, "customizeObject", js.Any.fromFunction3(value))
      
      inline def setCustomizeObjectUndefined: Self = StObject.set(x, "customizeObject", js.undefined)
    }
  }
  
  type Key = String
}
