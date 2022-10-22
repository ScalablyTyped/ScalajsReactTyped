package typingsJapgolly.marvelappReactAbTest

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.marvelappReactAbTest.anon.Children
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@marvelapp/react-ab-test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Experiment(hasNameDefaultVariantNameUserIdentifierChildren: ExperimentProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Experiment")(hasNameDefaultVariantNameUserIdentifierChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Variant(hasNameChildren: Children): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Variant")(hasNameChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object emitter {
    
    @JSImport("@marvelapp/react-ab-test", "emitter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addActiveVariantListener(eventName: String): Subscription = ^.asInstanceOf[js.Dynamic].applyDynamic("addActiveVariantListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Subscription]
    inline def addActiveVariantListener(eventName: String, callback: ListenerCallback): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("addActiveVariantListener")(eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Subscription]
    inline def addActiveVariantListener(eventName: ListenerCallback): Subscription = ^.asInstanceOf[js.Dynamic].applyDynamic("addActiveVariantListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Subscription]
    inline def addActiveVariantListener(eventName: ListenerCallback, callback: ListenerCallback): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("addActiveVariantListener")(eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Subscription]
    
    inline def addPlayListener(eventName: String): Subscription = ^.asInstanceOf[js.Dynamic].applyDynamic("addPlayListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Subscription]
    inline def addPlayListener(eventName: String, callback: ListenerCallback): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("addPlayListener")(eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Subscription]
    inline def addPlayListener(eventName: ListenerCallback): Subscription = ^.asInstanceOf[js.Dynamic].applyDynamic("addPlayListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Subscription]
    inline def addPlayListener(eventName: ListenerCallback, callback: ListenerCallback): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("addPlayListener")(eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Subscription]
    
    inline def addWinListener(eventName: String): Subscription = ^.asInstanceOf[js.Dynamic].applyDynamic("addWinListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Subscription]
    inline def addWinListener(eventName: String, callback: ListenerCallback): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("addWinListener")(eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Subscription]
    inline def addWinListener(eventName: ListenerCallback): Subscription = ^.asInstanceOf[js.Dynamic].applyDynamic("addWinListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Subscription]
    inline def addWinListener(eventName: ListenerCallback, callback: ListenerCallback): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("addWinListener")(eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Subscription]
    
    inline def calculateActiveVariant(experimentName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateActiveVariant")(experimentName.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def calculateActiveVariant(experimentName: String, userIdentifier: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateActiveVariant")(experimentName.asInstanceOf[js.Any], userIdentifier.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def calculateActiveVariant(experimentName: String, userIdentifier: String, defaultVariantName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateActiveVariant")(experimentName.asInstanceOf[js.Any], userIdentifier.asInstanceOf[js.Any], defaultVariantName.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def calculateActiveVariant(experimentName: String, userIdentifier: Unit, defaultVariantName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateActiveVariant")(experimentName.asInstanceOf[js.Any], userIdentifier.asInstanceOf[js.Any], defaultVariantName.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def defineVariants(experimentName: String, variantNames: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineVariants")(experimentName.asInstanceOf[js.Any], variantNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def defineVariants(experimentName: String, variantNames: js.Array[String], variantWeights: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineVariants")(experimentName.asInstanceOf[js.Any], variantNames.asInstanceOf[js.Any], variantWeights.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def emitWin(experimentName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("emitWin")(experimentName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getActiveVariant(experimentName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveVariant")(experimentName.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getSortedVariants(experimentName: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSortedVariants")(experimentName.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    inline def setActiveVariant(experimentName: String, variantName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setActiveVariant")(experimentName.asInstanceOf[js.Any], variantName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setCustomDistributionAlgorithm(
      customAlgorithm: js.Function3[
          /* experimentName */ String, 
          /* userIdentifier */ String, 
          /* defaultVariantName */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCustomDistributionAlgorithm")(customAlgorithm.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object experimentDebugger {
    
    @JSImport("@marvelapp/react-ab-test", "experimentDebugger")
    @js.native
    val ^ : js.Any = js.native
    
    inline def disable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[Unit]
    
    inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
    
    inline def setDebuggerAvailable(isAvailable: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDebuggerAvailable")(isAvailable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object mixpanelHelper {
    
    @JSImport("@marvelapp/react-ab-test", "mixpanelHelper")
    @js.native
    val ^ : js.Any = js.native
    
    inline def disable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[Unit]
    
    inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
  }
  
  object segmentHelper {
    
    @JSImport("@marvelapp/react-ab-test", "segmentHelper")
    @js.native
    val ^ : js.Any = js.native
    
    inline def disable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[Unit]
    
    inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
  }
  
  trait ExperimentProps extends StObject {
    
    var children: Node
    
    var defaultVariantName: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var userIdentifier: js.UndefOr[String] = js.undefined
  }
  object ExperimentProps {
    
    inline def apply(name: String): ExperimentProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[ExperimentProps]
    }
    
    extension [Self <: ExperimentProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDefaultVariantName(value: String): Self = StObject.set(x, "defaultVariantName", value.asInstanceOf[js.Any])
      
      inline def setDefaultVariantNameUndefined: Self = StObject.set(x, "defaultVariantName", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUserIdentifier(value: String): Self = StObject.set(x, "userIdentifier", value.asInstanceOf[js.Any])
      
      inline def setUserIdentifierUndefined: Self = StObject.set(x, "userIdentifier", js.undefined)
    }
  }
  
  type ListenerCallback = js.Function2[/* experimentName */ String, /* variantName */ String, Unit]
  
  trait Subscription extends StObject {
    
    var eventType: String
    
    var listener: ListenerCallback
    
    def remove(): Unit
  }
  object Subscription {
    
    inline def apply(
      eventType: String,
      listener: (/* experimentName */ String, /* variantName */ String) => Callback,
      remove: Callback
    ): Subscription = {
      val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], listener = js.Any.fromFunction2((t0: /* experimentName */ String, t1: /* variantName */ String) => (listener(t0, t1)).runNow()), remove = remove.toJsFn)
      __obj.asInstanceOf[Subscription]
    }
    
    extension [Self <: Subscription](x: Self) {
      
      inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
      
      inline def setListener(value: (/* experimentName */ String, /* variantName */ String) => Callback): Self = StObject.set(x, "listener", js.Any.fromFunction2((t0: /* experimentName */ String, t1: /* variantName */ String) => (value(t0, t1)).runNow()))
      
      inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
    }
  }
}
