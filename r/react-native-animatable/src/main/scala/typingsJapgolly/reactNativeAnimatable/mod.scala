package typingsJapgolly.reactNativeAnimatable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ClassicComponent
import typingsJapgolly.react.mod.ClassicComponentClass
import typingsJapgolly.reactNative.mod.ImageProperties
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.NativeMethods
import typingsJapgolly.reactNative.mod.TextProperties
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewProperties
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeAnimatable.anon.Finished
import typingsJapgolly.reactNativeAnimatable.anon.Style
import typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.infinite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-animatable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-animatable", "Image")
  @js.native
  val Image: AnimatableComponent[ImageProperties, ImageStyle] = js.native
  type Image = AnimatableComponent[ImageProperties, ImageStyle]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-native-animatable", "Image")
  @js.native
  open class ImageCls protected ()
    extends ClassicComponent[AnimatableProperties[ImageStyle] & ImageProperties, js.Object] {
    def this(props: AnimatableProperties[ImageStyle] & ImageProperties) = this()
    def this(props: AnimatableProperties[ImageStyle] & ImageProperties, context: Any) = this()
  }
  
  @JSImport("react-native-animatable", "Text")
  @js.native
  val Text: AnimatableComponent[TextProperties, TextStyle] = js.native
  type Text = AnimatableComponent[TextProperties, TextStyle]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-native-animatable", "Text")
  @js.native
  open class TextCls protected ()
    extends ClassicComponent[AnimatableProperties[TextStyle] & TextProperties, js.Object] {
    def this(props: AnimatableProperties[TextStyle] & TextProperties) = this()
    def this(props: AnimatableProperties[TextStyle] & TextProperties, context: Any) = this()
  }
  
  @JSImport("react-native-animatable", "View")
  @js.native
  val View: AnimatableComponent[ViewProperties, ViewStyle] = js.native
  type View = AnimatableComponent[ViewProperties, ViewStyle]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-native-animatable", "View")
  @js.native
  open class ViewCls protected ()
    extends ClassicComponent[AnimatableProperties[ViewStyle] & ViewProperties, js.Object] {
    def this(props: AnimatableProperties[ViewStyle] & ViewProperties) = this()
    def this(props: AnimatableProperties[ViewStyle] & ViewProperties, context: Any) = this()
  }
  
  inline def createAnimatableComponent[P /* <: Style */, S](Component: ComponentClassP[P & js.Object]): AnimatableComponent[P, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatableComponent")(Component.asInstanceOf[js.Any]).asInstanceOf[AnimatableComponent[P, S]]
  inline def createAnimatableComponent[P /* <: Style */, S](
    Component: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StatelessComponent<P> */ Any
  ): AnimatableComponent[P, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatableComponent")(Component.asInstanceOf[js.Any]).asInstanceOf[AnimatableComponent[P, S]]
  inline def createAnimatableComponent[P /* <: Style */, S](Component: ClassicComponentClass[P]): AnimatableComponent[P, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatableComponent")(Component.asInstanceOf[js.Any]).asInstanceOf[AnimatableComponent[P, S]]
  
  inline def createAnimation(animation: CustomAnimation[TextStyle & ViewStyle & ImageStyle]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimation")(animation.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def initializeRegistryWithDefinitions(animations: StringDictionary[CustomAnimation[TextStyle & ViewStyle & ImageStyle]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeRegistryWithDefinitions")(animations.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerAnimation(name: String, animation: CustomAnimation[TextStyle & ViewStyle & ImageStyle]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAnimation")(name.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Inlined std.Partial<{[ k in react-native-animatable.react-native-animatable.Animation ]: (duration : number | undefined): std.Promise<{  finished :boolean}>}> */
  trait AnimatableAnimationMethods extends StObject {
    
    var bounce: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var bounceIn: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var bounceInDown: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var bounceInLeft: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var bounceInRight: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var bounceInUp: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var bounceOut: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var bounceOutDown: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var bounceOutLeft: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var bounceOutRight: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var bounceOutUp: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeIn: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeInDown: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeInDownBig: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeInLeft: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeInLeftBig: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeInRight: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeInRightBig: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeInUp: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeInUpBig: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeOut: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeOutDown: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeOutDownBig: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeOutLeft: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeOutLeftBig: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeOutRight: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeOutRightBig: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeOutUp: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var fadeOutUpBig: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var flash: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var flipInX: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var flipInY: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var flipOutX: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var flipOutY: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var jello: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var lightSpeedIn: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var lightSpeedOut: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var pulse: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var rotate: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var rubberBand: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var shake: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var slideInDown: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var slideInLeft: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var slideInRight: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var slideInUp: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var slideOutDown: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var slideOutLeft: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var slideOutRight: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var slideOutUp: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var swing: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var tada: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var wobble: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var zoomIn: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var zoomInDown: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var zoomInLeft: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var zoomInRight: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var zoomInUp: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var zoomOut: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var zoomOutDown: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var zoomOutLeft: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var zoomOutRight: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
    
    var zoomOutUp: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.undefined
  }
  object AnimatableAnimationMethods {
    
    inline def apply(): AnimatableAnimationMethods = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimatableAnimationMethods]
    }
    
    extension [Self <: AnimatableAnimationMethods](x: Self) {
      
      inline def setBounce(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounce", js.Any.fromFunction1(value))
      
      inline def setBounceIn(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounceIn", js.Any.fromFunction1(value))
      
      inline def setBounceInDown(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounceInDown", js.Any.fromFunction1(value))
      
      inline def setBounceInDownUndefined: Self = StObject.set(x, "bounceInDown", js.undefined)
      
      inline def setBounceInLeft(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounceInLeft", js.Any.fromFunction1(value))
      
      inline def setBounceInLeftUndefined: Self = StObject.set(x, "bounceInLeft", js.undefined)
      
      inline def setBounceInRight(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounceInRight", js.Any.fromFunction1(value))
      
      inline def setBounceInRightUndefined: Self = StObject.set(x, "bounceInRight", js.undefined)
      
      inline def setBounceInUndefined: Self = StObject.set(x, "bounceIn", js.undefined)
      
      inline def setBounceInUp(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounceInUp", js.Any.fromFunction1(value))
      
      inline def setBounceInUpUndefined: Self = StObject.set(x, "bounceInUp", js.undefined)
      
      inline def setBounceOut(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounceOut", js.Any.fromFunction1(value))
      
      inline def setBounceOutDown(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounceOutDown", js.Any.fromFunction1(value))
      
      inline def setBounceOutDownUndefined: Self = StObject.set(x, "bounceOutDown", js.undefined)
      
      inline def setBounceOutLeft(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounceOutLeft", js.Any.fromFunction1(value))
      
      inline def setBounceOutLeftUndefined: Self = StObject.set(x, "bounceOutLeft", js.undefined)
      
      inline def setBounceOutRight(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounceOutRight", js.Any.fromFunction1(value))
      
      inline def setBounceOutRightUndefined: Self = StObject.set(x, "bounceOutRight", js.undefined)
      
      inline def setBounceOutUndefined: Self = StObject.set(x, "bounceOut", js.undefined)
      
      inline def setBounceOutUp(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounceOutUp", js.Any.fromFunction1(value))
      
      inline def setBounceOutUpUndefined: Self = StObject.set(x, "bounceOutUp", js.undefined)
      
      inline def setBounceUndefined: Self = StObject.set(x, "bounce", js.undefined)
      
      inline def setFadeIn(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeIn", js.Any.fromFunction1(value))
      
      inline def setFadeInDown(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeInDown", js.Any.fromFunction1(value))
      
      inline def setFadeInDownBig(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeInDownBig", js.Any.fromFunction1(value))
      
      inline def setFadeInDownBigUndefined: Self = StObject.set(x, "fadeInDownBig", js.undefined)
      
      inline def setFadeInDownUndefined: Self = StObject.set(x, "fadeInDown", js.undefined)
      
      inline def setFadeInLeft(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeInLeft", js.Any.fromFunction1(value))
      
      inline def setFadeInLeftBig(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeInLeftBig", js.Any.fromFunction1(value))
      
      inline def setFadeInLeftBigUndefined: Self = StObject.set(x, "fadeInLeftBig", js.undefined)
      
      inline def setFadeInLeftUndefined: Self = StObject.set(x, "fadeInLeft", js.undefined)
      
      inline def setFadeInRight(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeInRight", js.Any.fromFunction1(value))
      
      inline def setFadeInRightBig(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeInRightBig", js.Any.fromFunction1(value))
      
      inline def setFadeInRightBigUndefined: Self = StObject.set(x, "fadeInRightBig", js.undefined)
      
      inline def setFadeInRightUndefined: Self = StObject.set(x, "fadeInRight", js.undefined)
      
      inline def setFadeInUndefined: Self = StObject.set(x, "fadeIn", js.undefined)
      
      inline def setFadeInUp(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeInUp", js.Any.fromFunction1(value))
      
      inline def setFadeInUpBig(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeInUpBig", js.Any.fromFunction1(value))
      
      inline def setFadeInUpBigUndefined: Self = StObject.set(x, "fadeInUpBig", js.undefined)
      
      inline def setFadeInUpUndefined: Self = StObject.set(x, "fadeInUp", js.undefined)
      
      inline def setFadeOut(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeOut", js.Any.fromFunction1(value))
      
      inline def setFadeOutDown(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeOutDown", js.Any.fromFunction1(value))
      
      inline def setFadeOutDownBig(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeOutDownBig", js.Any.fromFunction1(value))
      
      inline def setFadeOutDownBigUndefined: Self = StObject.set(x, "fadeOutDownBig", js.undefined)
      
      inline def setFadeOutDownUndefined: Self = StObject.set(x, "fadeOutDown", js.undefined)
      
      inline def setFadeOutLeft(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeOutLeft", js.Any.fromFunction1(value))
      
      inline def setFadeOutLeftBig(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeOutLeftBig", js.Any.fromFunction1(value))
      
      inline def setFadeOutLeftBigUndefined: Self = StObject.set(x, "fadeOutLeftBig", js.undefined)
      
      inline def setFadeOutLeftUndefined: Self = StObject.set(x, "fadeOutLeft", js.undefined)
      
      inline def setFadeOutRight(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeOutRight", js.Any.fromFunction1(value))
      
      inline def setFadeOutRightBig(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeOutRightBig", js.Any.fromFunction1(value))
      
      inline def setFadeOutRightBigUndefined: Self = StObject.set(x, "fadeOutRightBig", js.undefined)
      
      inline def setFadeOutRightUndefined: Self = StObject.set(x, "fadeOutRight", js.undefined)
      
      inline def setFadeOutUndefined: Self = StObject.set(x, "fadeOut", js.undefined)
      
      inline def setFadeOutUp(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeOutUp", js.Any.fromFunction1(value))
      
      inline def setFadeOutUpBig(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeOutUpBig", js.Any.fromFunction1(value))
      
      inline def setFadeOutUpBigUndefined: Self = StObject.set(x, "fadeOutUpBig", js.undefined)
      
      inline def setFadeOutUpUndefined: Self = StObject.set(x, "fadeOutUp", js.undefined)
      
      inline def setFlash(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "flash", js.Any.fromFunction1(value))
      
      inline def setFlashUndefined: Self = StObject.set(x, "flash", js.undefined)
      
      inline def setFlipInX(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "flipInX", js.Any.fromFunction1(value))
      
      inline def setFlipInXUndefined: Self = StObject.set(x, "flipInX", js.undefined)
      
      inline def setFlipInY(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "flipInY", js.Any.fromFunction1(value))
      
      inline def setFlipInYUndefined: Self = StObject.set(x, "flipInY", js.undefined)
      
      inline def setFlipOutX(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "flipOutX", js.Any.fromFunction1(value))
      
      inline def setFlipOutXUndefined: Self = StObject.set(x, "flipOutX", js.undefined)
      
      inline def setFlipOutY(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "flipOutY", js.Any.fromFunction1(value))
      
      inline def setFlipOutYUndefined: Self = StObject.set(x, "flipOutY", js.undefined)
      
      inline def setJello(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "jello", js.Any.fromFunction1(value))
      
      inline def setJelloUndefined: Self = StObject.set(x, "jello", js.undefined)
      
      inline def setLightSpeedIn(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "lightSpeedIn", js.Any.fromFunction1(value))
      
      inline def setLightSpeedInUndefined: Self = StObject.set(x, "lightSpeedIn", js.undefined)
      
      inline def setLightSpeedOut(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "lightSpeedOut", js.Any.fromFunction1(value))
      
      inline def setLightSpeedOutUndefined: Self = StObject.set(x, "lightSpeedOut", js.undefined)
      
      inline def setPulse(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "pulse", js.Any.fromFunction1(value))
      
      inline def setPulseUndefined: Self = StObject.set(x, "pulse", js.undefined)
      
      inline def setRotate(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "rotate", js.Any.fromFunction1(value))
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setRubberBand(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "rubberBand", js.Any.fromFunction1(value))
      
      inline def setRubberBandUndefined: Self = StObject.set(x, "rubberBand", js.undefined)
      
      inline def setShake(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "shake", js.Any.fromFunction1(value))
      
      inline def setShakeUndefined: Self = StObject.set(x, "shake", js.undefined)
      
      inline def setSlideInDown(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "slideInDown", js.Any.fromFunction1(value))
      
      inline def setSlideInDownUndefined: Self = StObject.set(x, "slideInDown", js.undefined)
      
      inline def setSlideInLeft(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "slideInLeft", js.Any.fromFunction1(value))
      
      inline def setSlideInLeftUndefined: Self = StObject.set(x, "slideInLeft", js.undefined)
      
      inline def setSlideInRight(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "slideInRight", js.Any.fromFunction1(value))
      
      inline def setSlideInRightUndefined: Self = StObject.set(x, "slideInRight", js.undefined)
      
      inline def setSlideInUp(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "slideInUp", js.Any.fromFunction1(value))
      
      inline def setSlideInUpUndefined: Self = StObject.set(x, "slideInUp", js.undefined)
      
      inline def setSlideOutDown(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "slideOutDown", js.Any.fromFunction1(value))
      
      inline def setSlideOutDownUndefined: Self = StObject.set(x, "slideOutDown", js.undefined)
      
      inline def setSlideOutLeft(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "slideOutLeft", js.Any.fromFunction1(value))
      
      inline def setSlideOutLeftUndefined: Self = StObject.set(x, "slideOutLeft", js.undefined)
      
      inline def setSlideOutRight(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "slideOutRight", js.Any.fromFunction1(value))
      
      inline def setSlideOutRightUndefined: Self = StObject.set(x, "slideOutRight", js.undefined)
      
      inline def setSlideOutUp(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "slideOutUp", js.Any.fromFunction1(value))
      
      inline def setSlideOutUpUndefined: Self = StObject.set(x, "slideOutUp", js.undefined)
      
      inline def setSwing(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "swing", js.Any.fromFunction1(value))
      
      inline def setSwingUndefined: Self = StObject.set(x, "swing", js.undefined)
      
      inline def setTada(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "tada", js.Any.fromFunction1(value))
      
      inline def setTadaUndefined: Self = StObject.set(x, "tada", js.undefined)
      
      inline def setWobble(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "wobble", js.Any.fromFunction1(value))
      
      inline def setWobbleUndefined: Self = StObject.set(x, "wobble", js.undefined)
      
      inline def setZoomIn(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "zoomIn", js.Any.fromFunction1(value))
      
      inline def setZoomInDown(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "zoomInDown", js.Any.fromFunction1(value))
      
      inline def setZoomInDownUndefined: Self = StObject.set(x, "zoomInDown", js.undefined)
      
      inline def setZoomInLeft(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "zoomInLeft", js.Any.fromFunction1(value))
      
      inline def setZoomInLeftUndefined: Self = StObject.set(x, "zoomInLeft", js.undefined)
      
      inline def setZoomInRight(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "zoomInRight", js.Any.fromFunction1(value))
      
      inline def setZoomInRightUndefined: Self = StObject.set(x, "zoomInRight", js.undefined)
      
      inline def setZoomInUndefined: Self = StObject.set(x, "zoomIn", js.undefined)
      
      inline def setZoomInUp(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "zoomInUp", js.Any.fromFunction1(value))
      
      inline def setZoomInUpUndefined: Self = StObject.set(x, "zoomInUp", js.undefined)
      
      inline def setZoomOut(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "zoomOut", js.Any.fromFunction1(value))
      
      inline def setZoomOutDown(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "zoomOutDown", js.Any.fromFunction1(value))
      
      inline def setZoomOutDownUndefined: Self = StObject.set(x, "zoomOutDown", js.undefined)
      
      inline def setZoomOutLeft(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "zoomOutLeft", js.Any.fromFunction1(value))
      
      inline def setZoomOutLeftUndefined: Self = StObject.set(x, "zoomOutLeft", js.undefined)
      
      inline def setZoomOutRight(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "zoomOutRight", js.Any.fromFunction1(value))
      
      inline def setZoomOutRightUndefined: Self = StObject.set(x, "zoomOutRight", js.undefined)
      
      inline def setZoomOutUndefined: Self = StObject.set(x, "zoomOut", js.undefined)
      
      inline def setZoomOutUp(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "zoomOutUp", js.Any.fromFunction1(value))
      
      inline def setZoomOutUpUndefined: Self = StObject.set(x, "zoomOutUp", js.undefined)
    }
  }
  
  @js.native
  trait AnimatableComponent[P /* <: js.Object */, S /* <: js.Object */]
    extends StObject
       with NativeMethods
       with AnimatableAnimationMethods
       with ClassicComponentClass[AnimatableProperties[S] & P] {
    
    def stopAnimation(): Unit = js.native
    
    def transition[T /* <: S */](fromValues: T, toValues: T): Unit = js.native
    def transition[T /* <: S */](fromValues: T, toValues: T, duration: Double): Unit = js.native
    def transition[T /* <: S */](fromValues: T, toValues: T, duration: Double, easing: Easing): Unit = js.native
    def transition[T /* <: S */](fromValues: T, toValues: T, duration: Unit, easing: Easing): Unit = js.native
    
    def transitionTo[T /* <: S */](toValues: T): Unit = js.native
    def transitionTo[T /* <: S */](toValues: T, duration: Double): Unit = js.native
    def transitionTo[T /* <: S */](toValues: T, duration: Double, easing: Easing): Unit = js.native
    def transitionTo[T /* <: S */](toValues: T, duration: Unit, easing: Easing): Unit = js.native
  }
  
  trait AnimatableProperties[S /* <: js.Object */] extends StObject {
    
    var animation: js.UndefOr[Animation | String | (CustomAnimation[TextStyle & ViewStyle & ImageStyle])] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var direction: js.UndefOr[Direction] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[Easing] = js.undefined
    
    var iterationCount: js.UndefOr[Double | infinite] = js.undefined
    
    var iterationDelay: js.UndefOr[Double] = js.undefined
    
    var onAnimationBegin: js.UndefOr[js.Function] = js.undefined
    
    var onAnimationEnd: js.UndefOr[js.Function] = js.undefined
    
    var onTransitionBegin: js.UndefOr[js.Function1[/* property */ String, Unit]] = js.undefined
    
    var onTransitionEnd: js.UndefOr[js.Function1[/* property */ String, Unit]] = js.undefined
    
    var transition: js.UndefOr[(/* keyof S */ String) | (js.Array[/* keyof S */ String])] = js.undefined
    
    var useNativeDriver: js.UndefOr[Boolean] = js.undefined
  }
  object AnimatableProperties {
    
    inline def apply[S /* <: js.Object */](): AnimatableProperties[S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimatableProperties[S]]
    }
    
    extension [Self <: AnimatableProperties[?], S /* <: js.Object */](x: Self & AnimatableProperties[S]) {
      
      inline def setAnimation(value: Animation | String | (CustomAnimation[TextStyle & ViewStyle & ImageStyle])): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: Easing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingFunction1(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setIterationCount(value: Double | infinite): Self = StObject.set(x, "iterationCount", value.asInstanceOf[js.Any])
      
      inline def setIterationCountUndefined: Self = StObject.set(x, "iterationCount", js.undefined)
      
      inline def setIterationDelay(value: Double): Self = StObject.set(x, "iterationDelay", value.asInstanceOf[js.Any])
      
      inline def setIterationDelayUndefined: Self = StObject.set(x, "iterationDelay", js.undefined)
      
      inline def setOnAnimationBegin(value: js.Function): Self = StObject.set(x, "onAnimationBegin", value.asInstanceOf[js.Any])
      
      inline def setOnAnimationBeginUndefined: Self = StObject.set(x, "onAnimationBegin", js.undefined)
      
      inline def setOnAnimationEnd(value: js.Function): Self = StObject.set(x, "onAnimationEnd", value.asInstanceOf[js.Any])
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnTransitionBegin(value: /* property */ String => Callback): Self = StObject.set(x, "onTransitionBegin", js.Any.fromFunction1((t0: /* property */ String) => value(t0).runNow()))
      
      inline def setOnTransitionBeginUndefined: Self = StObject.set(x, "onTransitionBegin", js.undefined)
      
      inline def setOnTransitionEnd(value: /* property */ String => Callback): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1((t0: /* property */ String) => value(t0).runNow()))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setTransition(value: (/* keyof S */ String) | (js.Array[/* keyof S */ String])): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setTransitionVarargs(value: (/* keyof S */ String)*): Self = StObject.set(x, "transition", js.Array(value*))
      
      inline def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
      
      inline def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounce
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.flash
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.jello
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.pulse
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.rotate
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.rubberBand
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.shake
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.swing
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.tada
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.wobble
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounceIn
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInDown
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInUp
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInLeft
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInRight
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOut
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutDown
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutUp
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutLeft
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutRight
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeIn
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInDown
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInDownBig
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInUp
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInUpBig
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInLeft
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInLeftBig
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInRight
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInRightBig
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOut
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutDown
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutDownBig
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutUp
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutUpBig
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutLeft
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutLeftBig
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutRight
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutRightBig
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.flipInX
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.flipInY
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.flipOutX
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.flipOutY
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.lightSpeedIn
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.lightSpeedOut
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.slideInDown
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.slideInUp
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.slideInLeft
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.slideInRight
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutDown
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutUp
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutLeft
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutRight
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.zoomIn
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInDown
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInUp
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInLeft
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInRight
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOut
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutDown
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutUp
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutLeft
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutRight
  */
  trait Animation extends StObject
  object Animation {
    
    inline def bounce: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounce = "bounce".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounce]
    
    inline def bounceIn: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounceIn = "bounceIn".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounceIn]
    
    inline def bounceInDown: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInDown = "bounceInDown".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInDown]
    
    inline def bounceInLeft: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInLeft = "bounceInLeft".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInLeft]
    
    inline def bounceInRight: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInRight = "bounceInRight".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInRight]
    
    inline def bounceInUp: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInUp = "bounceInUp".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInUp]
    
    inline def bounceOut: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOut = "bounceOut".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOut]
    
    inline def bounceOutDown: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutDown = "bounceOutDown".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutDown]
    
    inline def bounceOutLeft: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutLeft = "bounceOutLeft".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutLeft]
    
    inline def bounceOutRight: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutRight = "bounceOutRight".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutRight]
    
    inline def bounceOutUp: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutUp = "bounceOutUp".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutUp]
    
    inline def fadeIn: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeIn = "fadeIn".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeIn]
    
    inline def fadeInDown: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInDown = "fadeInDown".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInDown]
    
    inline def fadeInDownBig: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInDownBig = "fadeInDownBig".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInDownBig]
    
    inline def fadeInLeft: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInLeft = "fadeInLeft".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInLeft]
    
    inline def fadeInLeftBig: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInLeftBig = "fadeInLeftBig".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInLeftBig]
    
    inline def fadeInRight: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInRight = "fadeInRight".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInRight]
    
    inline def fadeInRightBig: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInRightBig = "fadeInRightBig".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInRightBig]
    
    inline def fadeInUp: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInUp = "fadeInUp".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInUp]
    
    inline def fadeInUpBig: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInUpBig = "fadeInUpBig".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInUpBig]
    
    inline def fadeOut: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOut = "fadeOut".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOut]
    
    inline def fadeOutDown: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutDown = "fadeOutDown".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutDown]
    
    inline def fadeOutDownBig: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutDownBig = "fadeOutDownBig".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutDownBig]
    
    inline def fadeOutLeft: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutLeft = "fadeOutLeft".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutLeft]
    
    inline def fadeOutLeftBig: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutLeftBig = "fadeOutLeftBig".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutLeftBig]
    
    inline def fadeOutRight: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutRight = "fadeOutRight".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutRight]
    
    inline def fadeOutRightBig: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutRightBig = "fadeOutRightBig".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutRightBig]
    
    inline def fadeOutUp: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutUp = "fadeOutUp".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutUp]
    
    inline def fadeOutUpBig: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutUpBig = "fadeOutUpBig".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutUpBig]
    
    inline def flash: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.flash = "flash".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.flash]
    
    inline def flipInX: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.flipInX = "flipInX".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.flipInX]
    
    inline def flipInY: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.flipInY = "flipInY".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.flipInY]
    
    inline def flipOutX: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.flipOutX = "flipOutX".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.flipOutX]
    
    inline def flipOutY: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.flipOutY = "flipOutY".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.flipOutY]
    
    inline def jello: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.jello = "jello".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.jello]
    
    inline def lightSpeedIn: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.lightSpeedIn = "lightSpeedIn".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.lightSpeedIn]
    
    inline def lightSpeedOut: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.lightSpeedOut = "lightSpeedOut".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.lightSpeedOut]
    
    inline def pulse: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.pulse = "pulse".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.pulse]
    
    inline def rotate: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.rotate = "rotate".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.rotate]
    
    inline def rubberBand: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.rubberBand = "rubberBand".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.rubberBand]
    
    inline def shake: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.shake = "shake".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.shake]
    
    inline def slideInDown: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.slideInDown = "slideInDown".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.slideInDown]
    
    inline def slideInLeft: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.slideInLeft = "slideInLeft".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.slideInLeft]
    
    inline def slideInRight: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.slideInRight = "slideInRight".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.slideInRight]
    
    inline def slideInUp: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.slideInUp = "slideInUp".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.slideInUp]
    
    inline def slideOutDown: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutDown = "slideOutDown".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutDown]
    
    inline def slideOutLeft: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutLeft = "slideOutLeft".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutLeft]
    
    inline def slideOutRight: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutRight = "slideOutRight".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutRight]
    
    inline def slideOutUp: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutUp = "slideOutUp".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutUp]
    
    inline def swing: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.swing = "swing".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.swing]
    
    inline def tada: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.tada = "tada".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.tada]
    
    inline def wobble: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.wobble = "wobble".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.wobble]
    
    inline def zoomIn: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.zoomIn = "zoomIn".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.zoomIn]
    
    inline def zoomInDown: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInDown = "zoomInDown".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInDown]
    
    inline def zoomInLeft: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInLeft = "zoomInLeft".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInLeft]
    
    inline def zoomInRight: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInRight = "zoomInRight".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInRight]
    
    inline def zoomInUp: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInUp = "zoomInUp".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInUp]
    
    inline def zoomOut: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOut = "zoomOut".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOut]
    
    inline def zoomOutDown: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutDown = "zoomOutDown".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutDown]
    
    inline def zoomOutLeft: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutLeft = "zoomOutLeft".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutLeft]
    
    inline def zoomOutRight: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutRight = "zoomOutRight".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutRight]
    
    inline def zoomOutUp: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutUp = "zoomOutUp".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutUp]
  }
  
  trait CustomAnimation[T]
    extends StObject
       with /* progress */ NumberDictionary[T] {
    
    var easing: js.UndefOr[Easing] = js.undefined
    
    var from: js.UndefOr[T] = js.undefined
    
    var style: js.UndefOr[T] = js.undefined
    
    var to: js.UndefOr[T] = js.undefined
  }
  object CustomAnimation {
    
    inline def apply[T](): CustomAnimation[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomAnimation[T]]
    }
    
    extension [Self <: CustomAnimation[?], T](x: Self & CustomAnimation[T]) {
      
      inline def setEasing(value: Easing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingFunction1(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setFrom(value: T): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setStyle(value: T): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTo(value: T): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.normal
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.reverse
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.alternate
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`alternate-reverse`
  */
  trait Direction extends StObject
  object Direction {
    
    inline def alternate: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.alternate = "alternate".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.alternate]
    
    inline def `alternate-reverse`: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`alternate-reverse` = "alternate-reverse".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`alternate-reverse`]
    
    inline def normal: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.normal = "normal".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.normal]
    
    inline def reverse: typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.reverse = "reverse".asInstanceOf[typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.reverse]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.linear
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.ease
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-cubic`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-cubic`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-cubic`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-circ`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-circ`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-circ`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-expo`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-expo`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-expo`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-quad`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-quad`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-quad`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-quart`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-quart`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-quart`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-quint`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-quint`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-quint`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-sine`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-sine`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-sine`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-back`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-back`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-back`
    - typingsJapgolly.reactNativeAnimatable.mod.EasingFunction
  */
  type Easing = _Easing | EasingFunction
  
  type EasingFunction = js.Function1[/* t */ Double, Double]
  
  type GetPropertyType[B, K /* <: /* keyof B */ String */] = /* import warning: importer.ImportType#apply Failed type conversion: B[K] */ js.Any
  
  trait _Easing extends StObject
}
