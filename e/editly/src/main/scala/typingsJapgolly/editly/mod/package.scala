package typingsJapgolly.editly.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.editly.mod.^
import typingsJapgolly.fabric.mod.fabric.Canvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Edit and render videos.
  *
  * @param config - Config.
  */
inline def apply(config: Config): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

/**
	 * WARNING: Undocumented feature!
	 * Pure function to get a frame at a certain time.
	 *
	 * @param config - Config.
	 */
inline def renderSingleFrame(config: RenderSingleFrameConfig): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderSingleFrame")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

/**
	 * @see [Curve types]{@link https://trac.ffmpeg.org/wiki/AfadeCurves}
	 */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.editly.editlyStrings.tri
  - typingsJapgolly.editly.editlyStrings.qsin
  - typingsJapgolly.editly.editlyStrings.hsin
  - typingsJapgolly.editly.editlyStrings.esin
  - typingsJapgolly.editly.editlyStrings.log
  - typingsJapgolly.editly.editlyStrings.ipar
  - typingsJapgolly.editly.editlyStrings.qua
  - typingsJapgolly.editly.editlyStrings.cub
  - typingsJapgolly.editly.editlyStrings.squ
  - typingsJapgolly.editly.editlyStrings.cbr
  - typingsJapgolly.editly.editlyStrings.par
  - typingsJapgolly.editly.editlyStrings.exp
  - typingsJapgolly.editly.editlyStrings.iqsin
  - typingsJapgolly.editly.editlyStrings.ihsin
  - typingsJapgolly.editly.editlyStrings.dese
  - typingsJapgolly.editly.editlyStrings.desi
  - typingsJapgolly.editly.editlyStrings.losi
  - typingsJapgolly.editly.editlyStrings.nofade
  - java.lang.String
*/
type CurveType = _CurveType | String

type CustomCanvasFunction = js.Function1[/* args */ CustomCanvasFunctionArgs, OptionalPromise[CustomFunctionCallbacks]]

type CustomFabricFunction = js.Function1[/* args */ CustomFabricFunctionArgs, OptionalPromise[CustomFunctionCallbacks]]

type DefaultTransitionOptions = Transition

type OnCloseCallback = js.Function0[OptionalPromise[Unit]]

type OnRenderCallback = js.Function2[/* progress */ Double, /* canvas */ Canvas, OptionalPromise[Unit]]

/** Little utility */
type OptionalPromise[T] = js.Promise[T] | T

/**
	 * WARNING: Undocumented feature!
	 */
type TransitionParams = /**
		 * WARNING: Undocumented feature!
		 */
StringDictionary[Double | Boolean | GLTextureLike | js.Array[Double]]

/**
	 * @see [Transition types]{@link https://github.com/mifi/editly#transition-types}
	 */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.editly.editlyStrings.`directional-left`
  - typingsJapgolly.editly.editlyStrings.`directional-right`
  - typingsJapgolly.editly.editlyStrings.`directional-up`
  - typingsJapgolly.editly.editlyStrings.`directional-down`
  - typingsJapgolly.editly.editlyStrings.random
  - typingsJapgolly.editly.editlyStrings.dummy
  - java.lang.String
*/
type TransitionType = _TransitionType | String
