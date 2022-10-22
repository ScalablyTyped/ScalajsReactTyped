package typingsJapgolly.poseCore

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.poseCore.libTypesMod.ActivePoses
import typingsJapgolly.poseCore.libTypesMod.AncestorValue
import typingsJapgolly.poseCore.libTypesMod.AncestorValueList
import typingsJapgolly.poseCore.libTypesMod.ConvertValue
import typingsJapgolly.poseCore.libTypesMod.CreateValue
import typingsJapgolly.poseCore.libTypesMod.CreateValueProps
import typingsJapgolly.poseCore.libTypesMod.PassiveValueMap
import typingsJapgolly.poseCore.libTypesMod.PoseMap
import typingsJapgolly.poseCore.libTypesMod.Props
import typingsJapgolly.poseCore.libTypesMod.ReadValue
import typingsJapgolly.poseCore.libTypesMod.ReadValueFromSource
import typingsJapgolly.poseCore.libTypesMod.SetValueNative
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFactoriesValuesMod {
  
  @JSImport("pose-core/lib/factories/values", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V, A, TD](props: ValueFactoryProps[V, A, TD]): Map[String, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Map[String, V]]
  
  @JSImport("pose-core/lib/factories/values", "DEFAULT_INITIAL_POSE")
  @js.native
  val DEFAULT_INITIAL_POSE: /* "init" */ String = js.native
  
  trait ValueFactoryProps[V, A, TD] extends StObject {
    
    var activePoses: ActivePoses
    
    var ancestorValues: AncestorValueList[V]
    
    def convertValue(value: Any, key: String, props: Props): V
    @JSName("convertValue")
    var convertValue_Original: ConvertValue[V]
    
    def createValue(init: Any, key: String, props: Props): V
    def createValue(init: Any, key: String, props: Props, createValueProps: CreateValueProps): V
    @JSName("createValue")
    var createValue_Original: CreateValue[V]
    
    var initialPose: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var passive: js.UndefOr[PassiveValueMap] = js.undefined
    
    var poses: PoseMap[A, TD]
    
    var props: Props
    
    def readValue(value: V): Any
    
    var readValueFromSource: js.UndefOr[ReadValueFromSource] = js.undefined
    
    @JSName("readValue")
    var readValue_Original: ReadValue[V]
    
    def setValueNative(key: String, value: Any, props: Props): Unit
    @JSName("setValueNative")
    var setValueNative_Original: SetValueNative
    
    var userSetValues: StringDictionary[V]
  }
  object ValueFactoryProps {
    
    inline def apply[V, A, TD](
      activePoses: ActivePoses,
      ancestorValues: AncestorValueList[V],
      convertValue: (/* value */ Any, /* key */ String, /* props */ Props) => V,
      createValue: (/* init */ Any, /* key */ String, /* props */ Props, /* createValueProps */ js.UndefOr[CreateValueProps]) => V,
      poses: PoseMap[A, TD],
      props: Props,
      readValue: V => Any,
      setValueNative: (/* key */ String, /* value */ Any, /* props */ Props) => Callback,
      userSetValues: StringDictionary[V]
    ): ValueFactoryProps[V, A, TD] = {
      val __obj = js.Dynamic.literal(activePoses = activePoses.asInstanceOf[js.Any], ancestorValues = ancestorValues.asInstanceOf[js.Any], convertValue = js.Any.fromFunction3(convertValue), createValue = js.Any.fromFunction4(createValue), poses = poses.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], readValue = js.Any.fromFunction1(readValue), setValueNative = js.Any.fromFunction3((t0: /* key */ String, t1: /* value */ Any, t2: /* props */ Props) => (setValueNative(t0, t1, t2)).runNow()), userSetValues = userSetValues.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueFactoryProps[V, A, TD]]
    }
    
    extension [Self <: ValueFactoryProps[?, ?, ?], V, A, TD](x: Self & (ValueFactoryProps[V, A, TD])) {
      
      inline def setActivePoses(value: ActivePoses): Self = StObject.set(x, "activePoses", value.asInstanceOf[js.Any])
      
      inline def setAncestorValues(value: AncestorValueList[V]): Self = StObject.set(x, "ancestorValues", value.asInstanceOf[js.Any])
      
      inline def setAncestorValuesVarargs(value: AncestorValue[V]*): Self = StObject.set(x, "ancestorValues", js.Array(value*))
      
      inline def setConvertValue(value: (/* value */ Any, /* key */ String, /* props */ Props) => V): Self = StObject.set(x, "convertValue", js.Any.fromFunction3(value))
      
      inline def setCreateValue(
        value: (/* init */ Any, /* key */ String, /* props */ Props, /* createValueProps */ js.UndefOr[CreateValueProps]) => V
      ): Self = StObject.set(x, "createValue", js.Any.fromFunction4(value))
      
      inline def setInitialPose(value: String | js.Array[String]): Self = StObject.set(x, "initialPose", value.asInstanceOf[js.Any])
      
      inline def setInitialPoseUndefined: Self = StObject.set(x, "initialPose", js.undefined)
      
      inline def setInitialPoseVarargs(value: String*): Self = StObject.set(x, "initialPose", js.Array(value*))
      
      inline def setPassive(value: PassiveValueMap): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
      
      inline def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
      
      inline def setPoses(value: PoseMap[A, TD]): Self = StObject.set(x, "poses", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setReadValue(value: V => Any): Self = StObject.set(x, "readValue", js.Any.fromFunction1(value))
      
      inline def setReadValueFromSource(value: (/* key */ String, /* props */ Props) => Any): Self = StObject.set(x, "readValueFromSource", js.Any.fromFunction2(value))
      
      inline def setReadValueFromSourceUndefined: Self = StObject.set(x, "readValueFromSource", js.undefined)
      
      inline def setSetValueNative(value: (/* key */ String, /* value */ Any, /* props */ Props) => Callback): Self = StObject.set(x, "setValueNative", js.Any.fromFunction3((t0: /* key */ String, t1: /* value */ Any, t2: /* props */ Props) => (value(t0, t1, t2)).runNow()))
      
      inline def setUserSetValues(value: StringDictionary[V]): Self = StObject.set(x, "userSetValues", value.asInstanceOf[js.Any])
    }
  }
}
