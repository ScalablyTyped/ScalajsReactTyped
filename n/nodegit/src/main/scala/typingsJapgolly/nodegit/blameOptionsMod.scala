package typingsJapgolly.nodegit

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nodegit.oidMod.Oid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blameOptionsMod {
  
  @JSImport("nodegit/blame-options", "BlameOptions")
  @js.native
  open class BlameOptions ()
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var flags: js.UndefOr[Double] = js.native
    
    var maxLine: js.UndefOr[Double] = js.native
    
    var minLine: js.UndefOr[Double] = js.native
    
    var minMatchCharacters: js.UndefOr[Double] = js.native
    
    var newestCommit: js.UndefOr[Oid] = js.native
    
    var oldestCommit: js.UndefOr[Oid] = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
}
