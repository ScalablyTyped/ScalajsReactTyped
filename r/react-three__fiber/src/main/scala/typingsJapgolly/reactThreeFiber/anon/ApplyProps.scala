package typingsJapgolly.reactThreeFiber.anon

import typingsJapgolly.reactReconciler.mod.Reconciler
import typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreRendererMod.Instance
import typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreRendererMod.InstanceProps
import typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreStoreMod.RootState
import typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreUtilsMod.DiffSet
import typingsJapgolly.zustand.reactMod.UseBoundStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyProps extends StObject {
  
  var applyProps: js.Function2[/* instance */ Instance, /* data */ InstanceProps | DiffSet, Instance]
  
  var reconciler: Reconciler[UseBoundStore[RootState], Instance, Unit, Instance, Instance]
}
object ApplyProps {
  
  inline def apply(
    applyProps: (/* instance */ Instance, /* data */ InstanceProps | DiffSet) => Instance,
    reconciler: Reconciler[UseBoundStore[RootState], Instance, Unit, Instance, Instance]
  ): ApplyProps = {
    val __obj = js.Dynamic.literal(applyProps = js.Any.fromFunction2(applyProps), reconciler = reconciler.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyProps]
  }
  
  extension [Self <: ApplyProps](x: Self) {
    
    inline def setApplyProps(value: (/* instance */ Instance, /* data */ InstanceProps | DiffSet) => Instance): Self = StObject.set(x, "applyProps", js.Any.fromFunction2(value))
    
    inline def setReconciler(value: Reconciler[UseBoundStore[RootState], Instance, Unit, Instance, Instance]): Self = StObject.set(x, "reconciler", value.asInstanceOf[js.Any])
  }
}
