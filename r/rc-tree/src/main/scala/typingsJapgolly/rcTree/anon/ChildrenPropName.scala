package typingsJapgolly.rcTree.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.rcTree.esInterfaceMod.DataEntity
import typingsJapgolly.rcTree.esInterfaceMod.DataNode
import typingsJapgolly.rcTree.esInterfaceMod.FieldNames
import typingsJapgolly.rcTree.esUtilsTreeUtilMod.ExternalGetKey
import typingsJapgolly.rcTree.esUtilsTreeUtilMod.Wrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenPropName extends StObject {
  
  var childrenPropName: js.UndefOr[String] = js.undefined
  
  var externalGetKey: js.UndefOr[ExternalGetKey] = js.undefined
  
  var fieldNames: js.UndefOr[FieldNames] = js.undefined
  
  var initWrapper: js.UndefOr[js.Function1[/* wrapper */ Wrapper, Wrapper]] = js.undefined
  
  var onProcessFinished: js.UndefOr[js.Function1[/* wrapper */ Wrapper, Unit]] = js.undefined
  
  var processEntity: js.UndefOr[js.Function2[/* entity */ DataEntity[DataNode], /* wrapper */ Wrapper, Unit]] = js.undefined
}
object ChildrenPropName {
  
  inline def apply(): ChildrenPropName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildrenPropName]
  }
  
  extension [Self <: ChildrenPropName](x: Self) {
    
    inline def setChildrenPropName(value: String): Self = StObject.set(x, "childrenPropName", value.asInstanceOf[js.Any])
    
    inline def setChildrenPropNameUndefined: Self = StObject.set(x, "childrenPropName", js.undefined)
    
    inline def setExternalGetKey(value: ExternalGetKey): Self = StObject.set(x, "externalGetKey", value.asInstanceOf[js.Any])
    
    inline def setExternalGetKeyFunction2(value: (DataNode, /* index */ js.UndefOr[Double]) => typingsJapgolly.rcTree.esInterfaceMod.Key): Self = StObject.set(x, "externalGetKey", js.Any.fromFunction2(value))
    
    inline def setExternalGetKeyUndefined: Self = StObject.set(x, "externalGetKey", js.undefined)
    
    inline def setFieldNames(value: FieldNames): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
    
    inline def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
    
    inline def setInitWrapper(value: /* wrapper */ Wrapper => Wrapper): Self = StObject.set(x, "initWrapper", js.Any.fromFunction1(value))
    
    inline def setInitWrapperUndefined: Self = StObject.set(x, "initWrapper", js.undefined)
    
    inline def setOnProcessFinished(value: /* wrapper */ Wrapper => Callback): Self = StObject.set(x, "onProcessFinished", js.Any.fromFunction1((t0: /* wrapper */ Wrapper) => value(t0).runNow()))
    
    inline def setOnProcessFinishedUndefined: Self = StObject.set(x, "onProcessFinished", js.undefined)
    
    inline def setProcessEntity(value: (/* entity */ DataEntity[DataNode], /* wrapper */ Wrapper) => Callback): Self = StObject.set(x, "processEntity", js.Any.fromFunction2((t0: /* entity */ DataEntity[DataNode], t1: /* wrapper */ Wrapper) => (value(t0, t1)).runNow()))
    
    inline def setProcessEntityUndefined: Self = StObject.set(x, "processEntity", js.undefined)
  }
}
