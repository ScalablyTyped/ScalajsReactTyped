package typingsJapgolly.typesettable

import typingsJapgolly.typesettable.buildSrcContextsMod.IRulerFactoryContext
import typingsJapgolly.typesettable.buildSrcMeasurersAbstractMeasurerMod.IDimensions
import typingsJapgolly.typesettable.buildSrcMeasurersAbstractMeasurerMod.IRuler
import typingsJapgolly.typesettable.buildSrcMeasurersCacheCharacterMeasurerMod.CacheCharacterMeasurer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcMeasurersCacheMeasurerMod {
  
  @JSImport("typesettable/build/src/measurers/cacheMeasurer", "CacheMeasurer")
  @js.native
  open class CacheMeasurer protected () extends CacheCharacterMeasurer {
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler) = this()
    
    def _measureNotFromCache(s: String): IDimensions = js.native
    
    /* private */ var dimCache: Any = js.native
  }
}
