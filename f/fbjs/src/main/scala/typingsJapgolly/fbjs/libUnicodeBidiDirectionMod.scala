package typingsJapgolly.fbjs

import typingsJapgolly.fbjs.fbjsStrings.ltr_
import typingsJapgolly.fbjs.fbjsStrings.rtl_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUnicodeBidiDirectionMod {
  
  @JSImport("fbjs/lib/UnicodeBidiDirection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // No strong direction
  @JSImport("fbjs/lib/UnicodeBidiDirection", "LTR")
  @js.native
  val LTR: typingsJapgolly.fbjs.fbjsStrings.LTR = js.native
  
  // Values
  @JSImport("fbjs/lib/UnicodeBidiDirection", "NEUTRAL")
  @js.native
  val NEUTRAL: typingsJapgolly.fbjs.fbjsStrings.NEUTRAL = js.native
  
  // Left-to-Right direction
  @JSImport("fbjs/lib/UnicodeBidiDirection", "RTL")
  @js.native
  val RTL: typingsJapgolly.fbjs.fbjsStrings.RTL = js.native
  
  /**
    * Get the global direction
    */
  inline def getGlobalDir(): BidiDirection = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalDir")().asInstanceOf[BidiDirection]
  
  /**
    * Get string value to be used for `dir` HTML attribute or `direction` CSS
    * property.
    */
  inline def getHTMLDir(dir: BidiDirection): HTMLDir = ^.asInstanceOf[js.Dynamic].applyDynamic("getHTMLDir")(dir.asInstanceOf[js.Any]).asInstanceOf[HTMLDir]
  
  /**
    * Get string value to be used for `dir` HTML attribute or `direction` CSS
    * property, but returns null if `dir` has same value as `otherDir`.
    * `null`.
    */
  inline def getHTMLDirIfDifferent(dir: BidiDirection, otherDir: BidiDirection): js.UndefOr[HTMLDir | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHTMLDirIfDifferent")(dir.asInstanceOf[js.Any], otherDir.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[HTMLDir | Null]]
  
  /**
    * Initialize the global direction
    */
  inline def initGlobalDir(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initGlobalDir")().asInstanceOf[Unit]
  
  // Right-to-Left direction
  /**
    * Check if a directionality value is a Strong one
    */
  inline def isStrong(dir: BidiDirection): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStrong")(dir.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  // Global Direction
  /**
    * Set the global direction.
    */
  inline def setGlobalDir(dir: BidiDirection): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalDir")(dir.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fbjs.fbjsStrings.LTR
    - typingsJapgolly.fbjs.fbjsStrings.RTL
    - typingsJapgolly.fbjs.fbjsStrings.NEUTRAL
  */
  trait BidiDirection extends StObject
  object BidiDirection {
    
    inline def LTR: typingsJapgolly.fbjs.fbjsStrings.LTR = "LTR".asInstanceOf[typingsJapgolly.fbjs.fbjsStrings.LTR]
    
    inline def NEUTRAL: typingsJapgolly.fbjs.fbjsStrings.NEUTRAL = "NEUTRAL".asInstanceOf[typingsJapgolly.fbjs.fbjsStrings.NEUTRAL]
    
    inline def RTL: typingsJapgolly.fbjs.fbjsStrings.RTL = "RTL".asInstanceOf[typingsJapgolly.fbjs.fbjsStrings.RTL]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fbjs.fbjsStrings.ltr_
    - typingsJapgolly.fbjs.fbjsStrings.rtl_
  */
  trait HTMLDir extends StObject
  object HTMLDir {
    
    inline def ltr: ltr_ = "ltr".asInstanceOf[ltr_]
    
    inline def rtl: rtl_ = "rtl".asInstanceOf[rtl_]
  }
}
