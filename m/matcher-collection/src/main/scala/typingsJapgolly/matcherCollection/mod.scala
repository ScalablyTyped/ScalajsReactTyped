package typingsJapgolly.matcherCollection

import typingsJapgolly.matcherCollection.anon.Match
import typingsJapgolly.minimatch.mod.IMinimatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("matcher-collection", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Match {
    def this(matchers: js.Array[String | IMinimatch]) = this()
    
    /* CompleteClass */
    override def `match`(value: String): Boolean = js.native
    
    /* CompleteClass */
    var matchers: js.Array[IMinimatch] = js.native
    
    /* CompleteClass */
    override def mayContain(value: String): Boolean = js.native
  }
}
