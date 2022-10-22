package typingsJapgolly.quadstore

import typingsJapgolly.asynciterator.mod.AsyncIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsGetSortingiteratorMod {
  
  @JSImport("quadstore/dist/cjs/get/sortingiterator", "SortingIterator")
  @js.native
  open class SortingIterator[In, Int, Out] protected () extends AsyncIterator[Out] {
    def this(
      source: AsyncIterator[In],
      compare: js.Function2[/* left */ Int, /* right */ Int, Double],
      digest: js.Function1[/* item */ In, Int],
      emit: js.Function1[/* item */ Int, Out]
    ) = this()
  }
}
