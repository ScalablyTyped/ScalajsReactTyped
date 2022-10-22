package typingsJapgolly.editly.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * How to fit image to screen. Can be one of:
	 * - `'contain'` - All the video will be contained within the frame and letterboxed.
	 * - `'contain-blur'` - Like contain, but with a blurred copy as the letterbox.
	 * - `'cover'` - Video be cropped to cover the whole screen (aspect ratio preserved).
	 * - `'stretch'` - Video will be stretched to cover the whole screen (aspect ratio ignored).
	 *
	 * @default 'contain-blur'
	 * @see [Example 'image.json5']{@link https://github.com/mifi/editly/blob/master/examples/image.json5}
	 * @see [Example 'videos.json5']{@link https://github.com/mifi/editly/blob/master/examples/videos.json5}
	 */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.editly.editlyStrings.contain
  - typingsJapgolly.editly.editlyStrings.`contain-blur`
  - typingsJapgolly.editly.editlyStrings.cover
  - typingsJapgolly.editly.editlyStrings.stretch
*/
trait ResizeMode extends StObject
object ResizeMode {
  
  inline def contain: typingsJapgolly.editly.editlyStrings.contain = "contain".asInstanceOf[typingsJapgolly.editly.editlyStrings.contain]
  
  inline def `contain-blur`: typingsJapgolly.editly.editlyStrings.`contain-blur` = "contain-blur".asInstanceOf[typingsJapgolly.editly.editlyStrings.`contain-blur`]
  
  inline def cover: typingsJapgolly.editly.editlyStrings.cover = "cover".asInstanceOf[typingsJapgolly.editly.editlyStrings.cover]
  
  inline def stretch: typingsJapgolly.editly.editlyStrings.stretch = "stretch".asInstanceOf[typingsJapgolly.editly.editlyStrings.stretch]
}
