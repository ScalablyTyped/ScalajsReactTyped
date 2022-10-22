package typingsJapgolly.powerbiVisualsTools.mod

import typingsJapgolly.powerbiVisualsTools.mod.jsCommon.IStringResourceProvider
import typingsJapgolly.powerbiVisualsTools.powerbiVisualsToolsInts.`0`
import typingsJapgolly.powerbiVisualsTools.powerbiVisualsToolsInts.`2`
import typingsJapgolly.powerbiVisualsTools.powerbiVisualsToolsInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object data {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.powerbiVisualsTools.mod.DataViewScopeIdentity
    - typingsJapgolly.powerbiVisualsTools.mod.data.DataViewScopeWildcard
    - typingsJapgolly.powerbiVisualsTools.mod.data.DataViewRoleWildcard
    - typingsJapgolly.powerbiVisualsTools.mod.data.DataViewScopeTotal
  */
  trait DataRepetitionSelector extends StObject
  object DataRepetitionSelector {
    
    inline def DataViewRoleWildcard(key: String, roles: js.Array[String]): typingsJapgolly.powerbiVisualsTools.mod.data.DataViewRoleWildcard = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = 0, roles = roles.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.powerbiVisualsTools.mod.data.DataViewRoleWildcard]
    }
    
    inline def DataViewScopeIdentity(expr: ISQExpr, key: String): typingsJapgolly.powerbiVisualsTools.mod.DataViewScopeIdentity = {
      val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = 1)
      __obj.asInstanceOf[typingsJapgolly.powerbiVisualsTools.mod.DataViewScopeIdentity]
    }
    
    inline def DataViewScopeTotal(exprs: js.Array[ISQExpr], key: String): typingsJapgolly.powerbiVisualsTools.mod.data.DataViewScopeTotal = {
      val __obj = js.Dynamic.literal(exprs = exprs.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = 2)
      __obj.asInstanceOf[typingsJapgolly.powerbiVisualsTools.mod.data.DataViewScopeTotal]
    }
    
    inline def DataViewScopeWildcard(exprs: js.Array[ISQExpr], key: String): typingsJapgolly.powerbiVisualsTools.mod.data.DataViewScopeWildcard = {
      val __obj = js.Dynamic.literal(exprs = exprs.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = 3)
      __obj.asInstanceOf[typingsJapgolly.powerbiVisualsTools.mod.data.DataViewScopeWildcard]
    }
  }
  
  /** Defines a match against all instances of given roles. */
  trait DataViewRoleWildcard
    extends StObject
       with DataRepetitionSelector {
    
    var key: String
    
    var kind: `0`
    
    var roles: js.Array[String]
  }
  object DataViewRoleWildcard {
    
    inline def apply(key: String, roles: js.Array[String]): DataViewRoleWildcard = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = 0, roles = roles.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataViewRoleWildcard]
    }
    
    extension [Self <: DataViewRoleWildcard](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKind(value: `0`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
    }
  }
  
  /** Defines a match against any Total within a given DataView scope. */
  trait DataViewScopeTotal
    extends StObject
       with DataRepetitionSelector {
    
    /* The exprs defining the scope that this Total has been evaluated for
      * It's an array to support expressing Total across a composite group
      * Example: If this represents Total sales of USA across States, the Exprs wil refer to "States"
      */
    var exprs: js.Array[ISQExpr]
    
    var key: String
    
    var kind: `2`
  }
  object DataViewScopeTotal {
    
    inline def apply(exprs: js.Array[ISQExpr], key: String): DataViewScopeTotal = {
      val __obj = js.Dynamic.literal(exprs = exprs.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = 2)
      __obj.asInstanceOf[DataViewScopeTotal]
    }
    
    extension [Self <: DataViewScopeTotal](x: Self) {
      
      inline def setExprs(value: js.Array[ISQExpr]): Self = StObject.set(x, "exprs", value.asInstanceOf[js.Any])
      
      inline def setExprsVarargs(value: ISQExpr*): Self = StObject.set(x, "exprs", js.Array(value*))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKind(value: `2`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  /** Defines a match against all instances of a given DataView scope. Does not match Subtotals. */
  trait DataViewScopeWildcard
    extends StObject
       with DataRepetitionSelector {
    
    var exprs: js.Array[ISQExpr]
    
    var key: String
    
    var kind: `3`
  }
  object DataViewScopeWildcard {
    
    inline def apply(exprs: js.Array[ISQExpr], key: String): DataViewScopeWildcard = {
      val __obj = js.Dynamic.literal(exprs = exprs.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = 3)
      __obj.asInstanceOf[DataViewScopeWildcard]
    }
    
    extension [Self <: DataViewScopeWildcard](x: Self) {
      
      inline def setExprs(value: js.Array[ISQExpr]): Self = StObject.set(x, "exprs", value.asInstanceOf[js.Any])
      
      inline def setExprsVarargs(value: ISQExpr*): Self = StObject.set(x, "exprs", js.Array(value*))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKind(value: `3`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  type DisplayNameGetter = (js.Function1[/* resourceProvider */ IStringResourceProvider, String]) | String
  
  trait ISQConstantExpr
    extends StObject
       with ISQExpr {
    
    var kind: js.UndefOr[Double] = js.undefined
  }
  object ISQConstantExpr {
    
    inline def apply(): ISQConstantExpr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISQConstantExpr]
    }
    
    extension [Self <: ISQConstantExpr](x: Self) {
      
      inline def setKind(value: Double): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    }
  }
  
  trait ISQExpr extends StObject {
    
    var args: js.UndefOr[ISQExpr] = js.undefined
    
    var left: js.UndefOr[ISQExpr] = js.undefined
    
    var right: js.UndefOr[ISQExpr] = js.undefined
  }
  object ISQExpr {
    
    inline def apply(): ISQExpr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISQExpr]
    }
    
    extension [Self <: ISQExpr](x: Self) {
      
      inline def setArgs(value: ISQExpr): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setLeft(value: ISQExpr): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: ISQExpr): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    }
  }
  
  // intentionally blank interfaces since this is not part of the public API
  trait ISemanticFilter extends StObject {
    
    var whereItems: js.UndefOr[js.Object] = js.undefined
  }
  object ISemanticFilter {
    
    inline def apply(): ISemanticFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISemanticFilter]
    }
    
    extension [Self <: ISemanticFilter](x: Self) {
      
      inline def setWhereItems(value: js.Object): Self = StObject.set(x, "whereItems", value.asInstanceOf[js.Any])
      
      inline def setWhereItemsUndefined: Self = StObject.set(x, "whereItems", js.undefined)
    }
  }
  
  /** Defines a selector for content, including data-, metadata, and user-defined repetition. */
  trait Selector extends StObject {
    
    /** Data-bound repetition selection. */
    var data: js.UndefOr[js.Array[DataRepetitionSelector]] = js.undefined
    
    /** User-defined repetition selection. */
    var id: js.UndefOr[String] = js.undefined
    
    /** Metadata-bound repetition selection.  Refers to a DataViewMetadataColumn queryName. */
    var metadata: js.UndefOr[String] = js.undefined
  }
  object Selector {
    
    inline def apply(): Selector = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Selector]
    }
    
    extension [Self <: Selector](x: Self) {
      
      inline def setData(value: js.Array[DataRepetitionSelector]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: DataRepetitionSelector*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
  
  trait SelectorsByColumn extends StObject {
    
    var key: js.UndefOr[String] = js.undefined
  }
  object SelectorsByColumn {
    
    inline def apply(): SelectorsByColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectorsByColumn]
    }
    
    extension [Self <: SelectorsByColumn](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
}
