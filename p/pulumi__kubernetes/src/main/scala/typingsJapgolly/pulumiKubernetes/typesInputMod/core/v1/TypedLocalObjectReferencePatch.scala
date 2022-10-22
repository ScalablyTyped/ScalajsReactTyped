package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TypedLocalObjectReference contains enough information to let you locate the typed referenced object inside the same namespace.
  */
trait TypedLocalObjectReferencePatch extends StObject {
  
  /**
    * APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
    */
  var apiGroup: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Kind is the type of resource being referenced
    */
  var kind: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Name is the name of resource being referenced
    */
  var name: js.UndefOr[Input[String]] = js.undefined
}
object TypedLocalObjectReferencePatch {
  
  inline def apply(): TypedLocalObjectReferencePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypedLocalObjectReferencePatch]
  }
  
  extension [Self <: TypedLocalObjectReferencePatch](x: Self) {
    
    inline def setApiGroup(value: Input[String]): Self = StObject.set(x, "apiGroup", value.asInstanceOf[js.Any])
    
    inline def setApiGroupUndefined: Self = StObject.set(x, "apiGroup", js.undefined)
    
    inline def setKind(value: Input[String]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
