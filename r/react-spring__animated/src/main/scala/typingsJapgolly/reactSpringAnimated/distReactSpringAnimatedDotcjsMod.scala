package typingsJapgolly.reactSpringAnimated

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSpringAnimated.anon.PartialHostConfig
import typingsJapgolly.reactSpringAnimated.distDeclarationsSrcAnimatedArrayMod.Value
import typingsJapgolly.reactSpringAnimated.distDeclarationsSrcTypesMod.AnimatedType
import typingsJapgolly.reactSpringAnimated.distDeclarationsSrcWithAnimatedMod.AnimatableComponent
import typingsJapgolly.reactSpringTypes.utilMod.Lookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distReactSpringAnimatedDotcjsMod {
  
  @JSImport("@react-spring/animated/dist/react-spring-animated.cjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@react-spring/animated/dist/react-spring-animated.cjs", "Animated")
  @js.native
  open class Animated[T] ()
    extends typingsJapgolly.reactSpringAnimated.distDeclarationsSrcMod.Animated[T]
  
  @JSImport("@react-spring/animated/dist/react-spring-animated.cjs", "AnimatedArray")
  @js.native
  open class AnimatedArray[T /* <: js.Array[Value] */] protected ()
    extends typingsJapgolly.reactSpringAnimated.distDeclarationsSrcMod.AnimatedArray[T] {
    def this(source: T) = this()
  }
  /* static members */
  object AnimatedArray {
    
    @JSImport("@react-spring/animated/dist/react-spring-animated.cjs", "AnimatedArray")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def create[T /* <: js.Array[Value] */](source: T): typingsJapgolly.reactSpringAnimated.distDeclarationsSrcAnimatedArrayMod.AnimatedArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(source.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactSpringAnimated.distDeclarationsSrcAnimatedArrayMod.AnimatedArray[T]]
  }
  
  @JSImport("@react-spring/animated/dist/react-spring-animated.cjs", "AnimatedObject")
  @js.native
  open class AnimatedObject protected ()
    extends typingsJapgolly.reactSpringAnimated.distDeclarationsSrcMod.AnimatedObject {
    def this(source: Lookup[Any]) = this()
  }
  
  @JSImport("@react-spring/animated/dist/react-spring-animated.cjs", "AnimatedString")
  @js.native
  open class AnimatedString protected ()
    extends typingsJapgolly.reactSpringAnimated.distDeclarationsSrcMod.AnimatedString {
    def this(value: String) = this()
  }
  /* static members */
  object AnimatedString {
    
    @JSImport("@react-spring/animated/dist/react-spring-animated.cjs", "AnimatedString")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def create(value: String): typingsJapgolly.reactSpringAnimated.distDeclarationsSrcAnimatedStringMod.AnimatedString = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactSpringAnimated.distDeclarationsSrcAnimatedStringMod.AnimatedString]
  }
  
  @JSImport("@react-spring/animated/dist/react-spring-animated.cjs", "AnimatedValue")
  @js.native
  open class AnimatedValue[T] protected ()
    extends typingsJapgolly.reactSpringAnimated.distDeclarationsSrcMod.AnimatedValue[T] {
    def this(_value: T) = this()
  }
  /* static members */
  object AnimatedValue {
    
    @JSImport("@react-spring/animated/dist/react-spring-animated.cjs", "AnimatedValue")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def create(value: Any): typingsJapgolly.reactSpringAnimated.distDeclarationsSrcAnimatedValueMod.AnimatedValue[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactSpringAnimated.distDeclarationsSrcAnimatedValueMod.AnimatedValue[Any]]
  }
  
  inline def createHost(components: js.Array[AnimatableComponent]): typingsJapgolly.reactSpringAnimated.anon.Animated = ^.asInstanceOf[js.Dynamic].applyDynamic("createHost")(components.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactSpringAnimated.anon.Animated]
  inline def createHost(
    components: js.Array[AnimatableComponent],
    hasApplyAnimatedValuesCreateAnimatedStyleGetComponentProps: PartialHostConfig
  ): typingsJapgolly.reactSpringAnimated.anon.Animated = (^.asInstanceOf[js.Dynamic].applyDynamic("createHost")(components.asInstanceOf[js.Any], hasApplyAnimatedValuesCreateAnimatedStyleGetComponentProps.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reactSpringAnimated.anon.Animated]
  inline def createHost(components: StringDictionary[AnimatableComponent]): typingsJapgolly.reactSpringAnimated.anon.Animated = ^.asInstanceOf[js.Dynamic].applyDynamic("createHost")(components.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactSpringAnimated.anon.Animated]
  inline def createHost(
    components: StringDictionary[AnimatableComponent],
    hasApplyAnimatedValuesCreateAnimatedStyleGetComponentProps: PartialHostConfig
  ): typingsJapgolly.reactSpringAnimated.anon.Animated = (^.asInstanceOf[js.Dynamic].applyDynamic("createHost")(components.asInstanceOf[js.Any], hasApplyAnimatedValuesCreateAnimatedStyleGetComponentProps.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reactSpringAnimated.anon.Animated]
  
  inline def getAnimated[T](owner: Any): js.UndefOr[typingsJapgolly.reactSpringAnimated.distDeclarationsSrcAnimatedMod.Animated[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnimated")(owner.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsJapgolly.reactSpringAnimated.distDeclarationsSrcAnimatedMod.Animated[T]]]
  
  inline def getAnimatedType(value: Any): AnimatedType[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnimatedType")(value.asInstanceOf[js.Any]).asInstanceOf[AnimatedType[Any]]
  
  inline def getPayload(owner: Any): js.UndefOr[
    js.Array[
      typingsJapgolly.reactSpringAnimated.distDeclarationsSrcAnimatedValueMod.AnimatedValue[Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPayload")(owner.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
    js.Array[
      typingsJapgolly.reactSpringAnimated.distDeclarationsSrcAnimatedValueMod.AnimatedValue[Any]
    ]
  ]]
  
  inline def isAnimated[T](value: Any): /* is @react-spring/animated.@react-spring/animated/dist/declarations/src/Animated.Animated<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnimated")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @react-spring/animated.@react-spring/animated/dist/declarations/src/Animated.Animated<T> */ Boolean]
  
  inline def setAnimated(owner: Any, node: typingsJapgolly.reactSpringAnimated.distDeclarationsSrcAnimatedMod.Animated[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setAnimated")(owner.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Any]
}
