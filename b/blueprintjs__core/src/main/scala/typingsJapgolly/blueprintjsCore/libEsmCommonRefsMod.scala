package typingsJapgolly.blueprintjsCore

import japgolly.scalajs.react.facade.React.RefFn
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCommonRefsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/common/refs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combineRefs[T](ref1: RefFn[T], ref2: RefFn[T]): js.Function1[/* instance */ T | Null, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineRefs")(ref1.asInstanceOf[js.Any], ref2.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* instance */ T | Null, Unit]]
  
  inline def getRef[T](): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getRef")().asInstanceOf[T | Null]
  inline def getRef[T](ref: T): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getRef")(ref.asInstanceOf[js.Any]).asInstanceOf[T | Null]
  inline def getRef[T](ref: RefHandle[T]): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getRef")(ref.asInstanceOf[js.Any]).asInstanceOf[T | Null]
  
  inline def isRefCallback[T](): /* is react.react.RefCallback<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRefCallback")().asInstanceOf[/* is react.react.RefCallback<T> */ Boolean]
  inline def isRefCallback[T](value: Ref[T]): /* is react.react.RefCallback<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRefCallback")(value.asInstanceOf[js.Any]).asInstanceOf[/* is react.react.RefCallback<T> */ Boolean]
  
  inline def isRefObject[T](): /* is react.react.RefObject<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRefObject")().asInstanceOf[/* is react.react.RefObject<T> */ Boolean]
  inline def isRefObject[T](value: Ref[T]): /* is react.react.RefObject<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRefObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is react.react.RefObject<T> */ Boolean]
  
  inline def mergeRefs[T](refs: Ref[T]*): RefFn[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeRefs")(refs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[RefFn[T]]
  
  inline def refHandler[T /* <: HTMLElement */, K /* <: String */](
    refTargetParent: /* import warning: importer.ImportType#apply Failed type conversion: {[ k in K ]: T | null} */ js.Any,
    refTargetKey: K
  ): RefFn[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("refHandler")(refTargetParent.asInstanceOf[js.Any], refTargetKey.asInstanceOf[js.Any])).asInstanceOf[RefFn[T]]
  inline def refHandler[T /* <: HTMLElement */, K /* <: String */](
    refTargetParent: /* import warning: importer.ImportType#apply Failed type conversion: {[ k in K ]: T | null} */ js.Any,
    refTargetKey: K,
    refProp: Ref[T]
  ): RefFn[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("refHandler")(refTargetParent.asInstanceOf[js.Any], refTargetKey.asInstanceOf[js.Any], refProp.asInstanceOf[js.Any])).asInstanceOf[RefFn[T]]
  
  inline def setRef[T](): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRef")().asInstanceOf[Unit]
  inline def setRef[T](refTarget: Unit, ref: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(refTarget.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setRef[T](refTarget: Ref[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(refTarget.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setRef[T](refTarget: Ref[T], ref: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(refTarget.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type IRef[T] = IRefObject[T] | IRefCallback[T]
  
  type IRefCallback[T] = js.Function1[/* ref */ T | Null, Any]
  
  trait IRefObject[T] extends StObject {
    
    var current: T | Null
  }
  object IRefObject {
    
    inline def apply[T](): IRefObject[T] = {
      val __obj = js.Dynamic.literal(current = null)
      __obj.asInstanceOf[IRefObject[T]]
    }
    
    extension [Self <: IRefObject[?], T](x: Self & IRefObject[T]) {
      
      inline def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentNull: Self = StObject.set(x, "current", null)
    }
  }
}
