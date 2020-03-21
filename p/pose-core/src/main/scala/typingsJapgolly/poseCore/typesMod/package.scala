package typingsJapgolly.poseCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ActiveActions[A] = typingsJapgolly.std.Map[java.lang.String, A]
  type ActivePoses = typingsJapgolly.std.Map[java.lang.String, js.Array[java.lang.String]]
  type AddTransitionDelay[A] = js.Function2[/* delay */ scala.Double, /* transition */ A, A]
  type AncestorValueList[V] = js.Array[typingsJapgolly.poseCore.typesMod.AncestorValue[V]]
  type ApplyMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.poseCore.typesMod.ApplyResolve | java.lang.String | scala.Double]
  type ApplyResolve = js.Function1[
    /* props */ typingsJapgolly.poseCore.typesMod.Props, 
    java.lang.String | scala.Double
  ]
  type BooleanPropFactory = js.Function1[/* props */ typingsJapgolly.poseCore.typesMod.Props, scala.Boolean]
  type ChildPosers[V, A, C, P] = typingsJapgolly.std.Set[typingsJapgolly.poseCore.typesMod.Poser[V, A, C, P]]
  type ConvertTransitionDefinition[V, A, TD] = js.Function3[
    /* value */ V, 
    /* transitionDef */ TD | A, 
    /* props */ typingsJapgolly.poseCore.typesMod.Props, 
    A
  ]
  type ConvertValue[V] = js.Function3[
    /* value */ js.Any, 
    /* key */ java.lang.String, 
    /* props */ typingsJapgolly.poseCore.typesMod.Props, 
    V
  ]
  type CreateValue[V] = js.Function4[
    /* init */ js.Any, 
    /* key */ java.lang.String, 
    /* props */ typingsJapgolly.poseCore.typesMod.Props, 
    /* createValueProps */ js.UndefOr[typingsJapgolly.poseCore.typesMod.CreateValueProps], 
    V
  ]
  type CreateValueProps = js.Any
  type ExtendAPI[V, A, C, P] = js.Function3[
    /* api */ typingsJapgolly.poseCore.typesMod.Poser[V, A, C, P], 
    /* state */ typingsJapgolly.poseCore.typesMod.PoserState[V, A, C, P], 
    /* config */ typingsJapgolly.poseCore.typesMod.PoserConfig[V], 
    typingsJapgolly.poseCore.typesMod.Poser[V, A, C, P]
  ]
  type GetInstantTransition[V, A] = js.Function2[/* value */ V, /* props */ typingsJapgolly.poseCore.typesMod.Props, A]
  type GetTransitionProps[V] = js.Function3[
    /* value */ V, 
    /* target */ scala.Double, 
    /* props */ typingsJapgolly.poseCore.typesMod.Props, 
    typingsJapgolly.poseCore.typesMod.Props
  ]
  type NumberPropFactory = js.Function1[/* props */ typingsJapgolly.poseCore.typesMod.Props, scala.Double]
  type OnChangeCallbacks = org.scalablytyped.runtime.StringDictionary[js.Function1[/* v */ js.Any, js.Any]]
  type PassiveValueMap = org.scalablytyped.runtime.StringDictionary[
    js.Tuple3[java.lang.String, js.Any, scala.Boolean | java.lang.String | scala.Unit]
  ]
  type PoseMap[A, TD] = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.poseCore.typesMod.Pose[A, TD]]
  type PoserFactory[V, A, C, P] = js.Function1[
    /* config */ typingsJapgolly.poseCore.typesMod.PoserConfig[V], 
    typingsJapgolly.poseCore.typesMod.Poser[V, A, C, P]
  ]
  type Props = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ReadValue[V] = js.Function1[/* value */ V, js.Any]
  type ReadValueFromSource = js.Function2[
    /* key */ java.lang.String, 
    /* props */ typingsJapgolly.poseCore.typesMod.Props, 
    js.Any
  ]
  type ResolveTarget[V] = js.Function2[/* value */ V, /* target */ js.Any, js.Any]
  type SelectValueToRead[V] = js.Function1[/* value */ V, js.Any]
  type SetValue[V] = js.Function2[/* v */ V, /* value */ js.Any, scala.Unit]
  type SetValueNative = js.Function3[
    /* key */ java.lang.String, 
    /* value */ js.Any, 
    /* props */ typingsJapgolly.poseCore.typesMod.Props, 
    scala.Unit
  ]
  type StaggerDirectionPropFactory = js.Function1[
    /* props */ typingsJapgolly.poseCore.typesMod.Props, 
    typingsJapgolly.poseCore.poseCoreNumbers.`1` | typingsJapgolly.poseCore.poseCoreNumbers.`-1`
  ]
  type StartAction[V, A, C] = js.Function3[/* value */ V, /* action */ A, /* complete */ js.Function0[js.Any], C]
  type StopAction[C] = js.Function1[/* controls */ C, js.Any]
  type TransformPose[V, A, C, P, TD] = js.Function3[
    /* pose */ typingsJapgolly.poseCore.typesMod.Pose[A, TD], 
    /* key */ java.lang.String, 
    /* state */ typingsJapgolly.poseCore.typesMod.PoserState[V, A, C, P], 
    typingsJapgolly.poseCore.typesMod.Pose[A, TD]
  ]
  type Transformer = js.Function1[/* v */ js.Any, js.Any]
  type TransitionFactory[A, TD] = js.Function1[
    /* props */ typingsJapgolly.poseCore.typesMod.Props, 
    TD | A | typingsJapgolly.poseCore.poseCoreBooleans.`false`
  ]
  type TransitionMap[A, TD] = org.scalablytyped.runtime.StringDictionary[
    TD | A | typingsJapgolly.poseCore.poseCoreBooleans.`false` | (typingsJapgolly.poseCore.typesMod.TransitionFactory[A, TD])
  ]
  type TransitionMapFactory[A, TD] = js.Function1[
    /* props */ typingsJapgolly.poseCore.typesMod.Props, 
    typingsJapgolly.poseCore.typesMod.TransitionMap[A, TD]
  ]
  type ValueMap[V] = typingsJapgolly.std.Map[java.lang.String, V]
}
