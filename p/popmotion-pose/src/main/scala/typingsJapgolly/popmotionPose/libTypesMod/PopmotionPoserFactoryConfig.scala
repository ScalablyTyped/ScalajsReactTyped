package typingsJapgolly.popmotionPose.libTypesMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.popmotionPose.anon.ElementStyler
import typingsJapgolly.poseCore.libTypesMod.ExtendAPI
import typingsJapgolly.poseCore.libTypesMod.Poser
import typingsJapgolly.poseCore.libTypesMod.PoserConfig
import typingsJapgolly.poseCore.libTypesMod.Props
import typingsJapgolly.poseCore.libTypesMod.ReadValueFromSource
import typingsJapgolly.poseCore.libTypesMod.TransformPose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopmotionPoserFactoryConfig[P, TD] extends StObject {
  
  def addListenerToValue(
    key: String,
    styler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Styler */ Any
  ): js.Function1[/* v */ Any, Unit]
  
  def extendAPI(
    api: Poser[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
      P
    ],
    state: typingsJapgolly.poseCore.libTypesMod.PoserState[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
      P
    ],
    config: PoserConfig[Value]
  ): Poser[
    Value, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
    P
  ]
  @JSName("extendAPI")
  var extendAPI_Original: ExtendAPI[
    Value, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
    P
  ]
  
  def forceRender(props: ElementStyler): Unit
  
  var posePriority: js.UndefOr[js.Array[String]] = js.undefined
  
  var readValueFromSource: js.UndefOr[ReadValueFromSource] = js.undefined
  
  def setValueNative(key: String, to: Any, props: ElementStyler): Unit
  
  def transformPose(
    pose: typingsJapgolly.poseCore.libTypesMod.Pose[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
      TD
    ],
    key: String,
    state: typingsJapgolly.poseCore.libTypesMod.PoserState[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
      P
    ]
  ): typingsJapgolly.poseCore.libTypesMod.Pose[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
    TD
  ]
  @JSName("transformPose")
  var transformPose_Original: TransformPose[
    Value, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
    P, 
    TD
  ]
}
object PopmotionPoserFactoryConfig {
  
  inline def apply[P, TD](
    addListenerToValue: (String, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Styler */ Any) => js.Function1[/* v */ Any, Unit],
    extendAPI: (/* api */ Poser[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
      P
    ], /* state */ typingsJapgolly.poseCore.libTypesMod.PoserState[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
      P
    ], /* config */ PoserConfig[Value]) => Poser[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
      P
    ],
    forceRender: ElementStyler => Callback,
    setValueNative: (String, Any, ElementStyler) => Callback,
    transformPose: (/* pose */ typingsJapgolly.poseCore.libTypesMod.Pose[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
      TD
    ], /* key */ String, /* state */ typingsJapgolly.poseCore.libTypesMod.PoserState[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
      P
    ]) => typingsJapgolly.poseCore.libTypesMod.Pose[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
      TD
    ]
  ): PopmotionPoserFactoryConfig[P, TD] = {
    val __obj = js.Dynamic.literal(addListenerToValue = js.Any.fromFunction2(addListenerToValue), extendAPI = js.Any.fromFunction3(extendAPI), forceRender = js.Any.fromFunction1((t0: ElementStyler) => forceRender(t0).runNow()), setValueNative = js.Any.fromFunction3((t0: String, t1: Any, t2: ElementStyler) => (setValueNative(t0, t1, t2)).runNow()), transformPose = js.Any.fromFunction3(transformPose))
    __obj.asInstanceOf[PopmotionPoserFactoryConfig[P, TD]]
  }
  
  extension [Self <: PopmotionPoserFactoryConfig[?, ?], P, TD](x: Self & (PopmotionPoserFactoryConfig[P, TD])) {
    
    inline def setAddListenerToValue(
      value: (String, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Styler */ Any) => js.Function1[/* v */ Any, Unit]
    ): Self = StObject.set(x, "addListenerToValue", js.Any.fromFunction2(value))
    
    inline def setExtendAPI(
      value: (/* api */ Poser[
          Value, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
          P
        ], /* state */ typingsJapgolly.poseCore.libTypesMod.PoserState[
          Value, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
          P
        ], /* config */ PoserConfig[Value]) => Poser[
          Value, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
          P
        ]
    ): Self = StObject.set(x, "extendAPI", js.Any.fromFunction3(value))
    
    inline def setForceRender(value: ElementStyler => Callback): Self = StObject.set(x, "forceRender", js.Any.fromFunction1((t0: ElementStyler) => value(t0).runNow()))
    
    inline def setPosePriority(value: js.Array[String]): Self = StObject.set(x, "posePriority", value.asInstanceOf[js.Any])
    
    inline def setPosePriorityUndefined: Self = StObject.set(x, "posePriority", js.undefined)
    
    inline def setPosePriorityVarargs(value: String*): Self = StObject.set(x, "posePriority", js.Array(value*))
    
    inline def setReadValueFromSource(value: (/* key */ String, /* props */ Props) => Any): Self = StObject.set(x, "readValueFromSource", js.Any.fromFunction2(value))
    
    inline def setReadValueFromSourceUndefined: Self = StObject.set(x, "readValueFromSource", js.undefined)
    
    inline def setSetValueNative(value: (String, Any, ElementStyler) => Callback): Self = StObject.set(x, "setValueNative", js.Any.fromFunction3((t0: String, t1: Any, t2: ElementStyler) => (value(t0, t1, t2)).runNow()))
    
    inline def setTransformPose(
      value: (/* pose */ typingsJapgolly.poseCore.libTypesMod.Pose[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
          TD
        ], /* key */ String, /* state */ typingsJapgolly.poseCore.libTypesMod.PoserState[
          Value, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
          P
        ]) => typingsJapgolly.poseCore.libTypesMod.Pose[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
          TD
        ]
    ): Self = StObject.set(x, "transformPose", js.Any.fromFunction3(value))
  }
}
