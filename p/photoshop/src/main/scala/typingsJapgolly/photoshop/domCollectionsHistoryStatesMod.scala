package typingsJapgolly.photoshop

import org.scalablytyped.runtime.NumberDictionary
import org.scalajs.dom.Document
import typingsJapgolly.photoshop.anon.Get
import typingsJapgolly.photoshop.domHistoryStateMod.HistoryState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domCollectionsHistoryStatesMod {
  
  @JSImport("photoshop/dom/collections/HistoryStates", "HistoryStates")
  @js.native
  open class HistoryStates protected ()
    extends StObject
       with /**
    * Used to access the history states in the collection
    */
  /* index */ NumberDictionary[HistoryState] {
    /**
      * @ignore
      */
    def this(docId: Double) = this()
    
    /**
      * @ignore
      */
    val _docId: Double = js.native
    
    /**
      * Find the first history state with the matching name
      */
    def getByName(name: String): HistoryState = js.native
    
    /**
      * @ignore
      */
    def handler(): Get = js.native
    
    /**
      * Number of [[HistoryState]] elements in this collection
      */
    def length: Double = js.native
    
    /**
      * The owner document of this HistoryState collection
      */
    def parent: Document = js.native
    
    /**
      * @ignore
      */
    /* private */ var proxy: Any = js.native
  }
}
