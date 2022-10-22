package typingsJapgolly.mobx

import japgolly.scalajs.react.Callback
import typingsJapgolly.mobx.distCoreDerivationMod.IDerivation
import typingsJapgolly.mobx.distCoreDerivationMod.IDerivationState
import typingsJapgolly.mobx.distUtilsUtilsMod.Lambda
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreObservableMod {
  
  @JSImport("mobx/dist/core/observable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addObserver(observable: IObservable, node: IDerivation): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addObserver")(observable.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def endBatch(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("endBatch")().asInstanceOf[Unit]
  
  inline def getObservers(observable: IObservable): Set[IDerivation] = ^.asInstanceOf[js.Dynamic].applyDynamic("getObservers")(observable.asInstanceOf[js.Any]).asInstanceOf[Set[IDerivation]]
  
  inline def hasObservers(observable: IObservable): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasObservers")(observable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def propagateChangeConfirmed(observable: IObservable): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("propagateChangeConfirmed")(observable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def propagateChanged(observable: IObservable): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("propagateChanged")(observable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def propagateMaybeChanged(observable: IObservable): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("propagateMaybeChanged")(observable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def queueForUnobservation(observable: IObservable): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("queueForUnobservation")(observable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeObserver(observable: IObservable, node: IDerivation): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeObserver")(observable.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def reportObserved(observable: IObservable): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("reportObserved")(observable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def startBatch(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startBatch")().asInstanceOf[Unit]
  
  trait IDepTreeNode extends StObject {
    
    var name_ : String
    
    var observing_ : js.UndefOr[js.Array[IObservable]] = js.undefined
  }
  object IDepTreeNode {
    
    inline def apply(name_ : String): IDepTreeNode = {
      val __obj = js.Dynamic.literal(name_ = name_.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDepTreeNode]
    }
    
    extension [Self <: IDepTreeNode](x: Self) {
      
      inline def setName_(value: String): Self = StObject.set(x, "name_", value.asInstanceOf[js.Any])
      
      inline def setObserving_(value: js.Array[IObservable]): Self = StObject.set(x, "observing_", value.asInstanceOf[js.Any])
      
      inline def setObserving_Undefined: Self = StObject.set(x, "observing_", js.undefined)
      
      inline def setObserving_Varargs(value: IObservable*): Self = StObject.set(x, "observing_", js.Array(value*))
    }
  }
  
  trait IObservable
    extends StObject
       with IDepTreeNode {
    
    var diffValue_ : Double
    
    var isBeingObserved_ : Boolean
    
    var isPendingUnobservation_ : Boolean
    
    /**
      * Id of the derivation *run* that last accessed this observable.
      * If this id equals the *run* id of the current derivation,
      * the dependency is already established
      */
    var lastAccessedBy_ : Double
    
    var lowestObserverState_ : IDerivationState
    
    var observers_ : Set[IDerivation]
    
    def onBO(): Unit
    
    var onBOL: js.UndefOr[Set[Lambda]] = js.undefined
    
    def onBUO(): Unit
    
    var onBUOL: js.UndefOr[Set[Lambda]] = js.undefined
  }
  object IObservable {
    
    inline def apply(
      diffValue_ : Double,
      isBeingObserved_ : Boolean,
      isPendingUnobservation_ : Boolean,
      lastAccessedBy_ : Double,
      lowestObserverState_ : IDerivationState,
      name_ : String,
      observers_ : Set[IDerivation],
      onBO: Callback,
      onBUO: Callback
    ): IObservable = {
      val __obj = js.Dynamic.literal(diffValue_ = diffValue_.asInstanceOf[js.Any], isBeingObserved_ = isBeingObserved_.asInstanceOf[js.Any], isPendingUnobservation_ = isPendingUnobservation_.asInstanceOf[js.Any], lastAccessedBy_ = lastAccessedBy_.asInstanceOf[js.Any], lowestObserverState_ = lowestObserverState_.asInstanceOf[js.Any], name_ = name_.asInstanceOf[js.Any], observers_ = observers_.asInstanceOf[js.Any], onBO = onBO.toJsFn, onBUO = onBUO.toJsFn)
      __obj.asInstanceOf[IObservable]
    }
    
    extension [Self <: IObservable](x: Self) {
      
      inline def setDiffValue_(value: Double): Self = StObject.set(x, "diffValue_", value.asInstanceOf[js.Any])
      
      inline def setIsBeingObserved_(value: Boolean): Self = StObject.set(x, "isBeingObserved_", value.asInstanceOf[js.Any])
      
      inline def setIsPendingUnobservation_(value: Boolean): Self = StObject.set(x, "isPendingUnobservation_", value.asInstanceOf[js.Any])
      
      inline def setLastAccessedBy_(value: Double): Self = StObject.set(x, "lastAccessedBy_", value.asInstanceOf[js.Any])
      
      inline def setLowestObserverState_(value: IDerivationState): Self = StObject.set(x, "lowestObserverState_", value.asInstanceOf[js.Any])
      
      inline def setObservers_(value: Set[IDerivation]): Self = StObject.set(x, "observers_", value.asInstanceOf[js.Any])
      
      inline def setOnBO(value: Callback): Self = StObject.set(x, "onBO", value.toJsFn)
      
      inline def setOnBOL(value: Set[Lambda]): Self = StObject.set(x, "onBOL", value.asInstanceOf[js.Any])
      
      inline def setOnBOLUndefined: Self = StObject.set(x, "onBOL", js.undefined)
      
      inline def setOnBUO(value: Callback): Self = StObject.set(x, "onBUO", value.toJsFn)
      
      inline def setOnBUOL(value: Set[Lambda]): Self = StObject.set(x, "onBUOL", value.asInstanceOf[js.Any])
      
      inline def setOnBUOLUndefined: Self = StObject.set(x, "onBUOL", js.undefined)
    }
  }
}
