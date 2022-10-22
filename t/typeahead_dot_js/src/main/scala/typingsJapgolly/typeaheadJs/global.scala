package typingsJapgolly.typeaheadJs

import typingsJapgolly.typeaheadJs.Bloodhound.BloodhoundOptions
import typingsJapgolly.typeaheadJs.Bloodhound.Tokenizers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Bloodhound is the typeahead.js suggestion engine. Bloodhound is robust,
    * flexible, and offers advanced functionalities such as prefetching,
    * intelligent caching, fast lookups, and backfilling with remote data.
    */
  @JSGlobal("Bloodhound")
  @js.native
  open class Bloodhound[T] protected ()
    extends StObject
       with typingsJapgolly.typeaheadJs.Bloodhound[T] {
    /**
      * The constructor function.
      *
      * @constructor
      * @param options Options hash.
      */
    def this(options: BloodhoundOptions[T]) = this()
  }
  object Bloodhound {
    
    @JSGlobal("Bloodhound")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a reference to Bloodhound and reverts window.Bloodhound to its
      * previous value. Can be used to avoid naming collisions.
      */
    /* static member */
    inline def noConflict(): typingsJapgolly.typeaheadJs.Bloodhound[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[typingsJapgolly.typeaheadJs.Bloodhound[Any]]
    
    /**
      * The Bloodhound suggestion engine is token-based, so how datums and queries are tokenized plays a vital role in the quality of search results.
      * Specify how you want datums and queries tokenized.
      */
    /* static member */
    @JSGlobal("Bloodhound.tokenizers")
    @js.native
    def tokenizers: Tokenizers = js.native
    inline def tokenizers_=(x: Tokenizers): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tokenizers")(x.asInstanceOf[js.Any])
  }
}
