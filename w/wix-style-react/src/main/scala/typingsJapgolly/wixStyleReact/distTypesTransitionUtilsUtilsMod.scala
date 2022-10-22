package typingsJapgolly.wixStyleReact

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.wixStyleReact.anon.AccentColor
import typingsJapgolly.wixStyleReact.anon.Exit
import typingsJapgolly.wixStyleReact.anon.`15`
import typingsJapgolly.wixStyleReact.distTypesTransitionConstantsMod.TransitionStyles
import typingsJapgolly.wixStyleReact.distTypesTransitionTransitionDottypesMod.EnterAnimation
import typingsJapgolly.wixStyleReact.distTypesTransitionTransitionDottypesMod.ExitAnimation
import typingsJapgolly.wixStyleReact.distTypesTransitionTransitionDottypesMod.MoveIn
import typingsJapgolly.wixStyleReact.distTypesTransitionTransitionDottypesMod.MoveOut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTransitionUtilsUtilsMod {
  
  @JSImport("wix-style-react/dist/types/Transition/utils/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMoveStyles(moveProps: MoveIn, isExiting: Boolean): StringDictionary[AccentColor] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMoveStyles")(moveProps.asInstanceOf[js.Any], isExiting.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[AccentColor]]
  inline def getMoveStyles(moveProps: MoveOut, isExiting: Boolean): StringDictionary[AccentColor] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMoveStyles")(moveProps.asInstanceOf[js.Any], isExiting.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[AccentColor]]
  
  inline def getPercentageValue(percentage: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getPercentageValue")(percentage.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getTimeout(): Exit = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeout")().asInstanceOf[Exit]
  inline def getTimeout(enterAnimation: Unit, exitAnimation: ExitAnimation): Exit = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeout")(enterAnimation.asInstanceOf[js.Any], exitAnimation.asInstanceOf[js.Any])).asInstanceOf[Exit]
  inline def getTimeout(enterAnimation: EnterAnimation): Exit = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeout")(enterAnimation.asInstanceOf[js.Any]).asInstanceOf[Exit]
  inline def getTimeout(enterAnimation: EnterAnimation, exitAnimation: ExitAnimation): Exit = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeout")(enterAnimation.asInstanceOf[js.Any], exitAnimation.asInstanceOf[js.Any])).asInstanceOf[Exit]
  
  inline def getTransitionStyles(hasWidthHeight: `15`): TransitionStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionStyles")(hasWidthHeight.asInstanceOf[js.Any]).asInstanceOf[TransitionStyles]
  inline def getTransitionStyles(hasWidthHeight: `15`, enterAnimation: Unit, exitAnimation: ExitAnimation): TransitionStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionStyles")(hasWidthHeight.asInstanceOf[js.Any], enterAnimation.asInstanceOf[js.Any], exitAnimation.asInstanceOf[js.Any])).asInstanceOf[TransitionStyles]
  inline def getTransitionStyles(hasWidthHeight: `15`, enterAnimation: EnterAnimation): TransitionStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionStyles")(hasWidthHeight.asInstanceOf[js.Any], enterAnimation.asInstanceOf[js.Any])).asInstanceOf[TransitionStyles]
  inline def getTransitionStyles(hasWidthHeight: `15`, enterAnimation: EnterAnimation, exitAnimation: ExitAnimation): TransitionStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionStyles")(hasWidthHeight.asInstanceOf[js.Any], enterAnimation.asInstanceOf[js.Any], exitAnimation.asInstanceOf[js.Any])).asInstanceOf[TransitionStyles]
}
