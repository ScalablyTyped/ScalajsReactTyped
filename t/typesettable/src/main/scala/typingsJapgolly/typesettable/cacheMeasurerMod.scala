package typingsJapgolly.typesettable

import typingsJapgolly.typesettable.abstractMeasurerMod.IDimensions
import typingsJapgolly.typesettable.abstractMeasurerMod.IRuler
import typingsJapgolly.typesettable.cacheCharacterMeasurerMod.CacheCharacterMeasurer
import typingsJapgolly.typesettable.contextsMod.IRulerFactoryContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/measurers/cacheMeasurer", JSImport.Namespace)
@js.native
object cacheMeasurerMod extends js.Object {
  @js.native
  class CacheMeasurer protected () extends CacheCharacterMeasurer {
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext) = this()
    var dimCache: js.Any = js.native
    def _measureNotFromCache(s: String): IDimensions = js.native
  }
  
}

