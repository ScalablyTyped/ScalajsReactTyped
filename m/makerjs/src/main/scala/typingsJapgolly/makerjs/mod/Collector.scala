package typingsJapgolly.makerjs.mod

import typingsJapgolly.makerjs.MakerJs.ICollectionKeyComparer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Collects items that share a common key.
  */
@JSImport("makerjs", "Collector")
@js.native
open class Collector[K, T] ()
  extends StObject
     with typingsJapgolly.makerjs.MakerJs.Collector[K, T] {
  def this(comparer: ICollectionKeyComparer[K]) = this()
}
