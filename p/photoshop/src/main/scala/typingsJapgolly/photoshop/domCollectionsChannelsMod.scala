package typingsJapgolly.photoshop

import org.scalajs.dom.Document
import typingsJapgolly.photoshop.anon.Get
import typingsJapgolly.photoshop.domChannelMod.Channel
import typingsJapgolly.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domCollectionsChannelsMod {
  
  @JSImport("photoshop/dom/collections/Channels", "Channels")
  @js.native
  open class Channels protected ()
    extends StObject
       with Array[Channel] {
    /** @ignore */
    def this(docId: Double) = this()
    
    /** @ignore */
    val _docId: Double = js.native
    
    /**
      * Create a new alpha channel in this document
      */
    def add(): Channel = js.native
    
    /**
      * Find the first channel with the matching name
      */
    def getByName(name: String): Channel = js.native
    
    /** @ignore */
    def handler(): Get = js.native
    
    /**
      * Number of Channel elements in this collection
      */
    @JSName("length")
    def length_MChannels: Double = js.native
    
    /**
      * The owner document of this Channel collection
      */
    def parent: Document = js.native
    
    /** @ignore */
    /* private */ var proxy: Any = js.native
    
    /**
      * Remove all Alpha channels in the parent document
      */
    def removeAll(): Unit = js.native
    
    /**
      * The name for this object collection: Channels
      */
    def typename: String = js.native
  }
}
