package typingsJapgolly.openlayers.mod.source

import typingsJapgolly.openlayers.mod.SourceImageOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Abstract base class; normally only used for creating subclasses and not
  * instantiated in apps.
  * Base class for sources providing a single image.
  *
  * @param options Single image source options.
  * @api
  */
@JSImport("openlayers", "source.Image")
@js.native
open class Image protected () extends Source {
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for sources providing a single image.
    *
    * @param options Single image source options.
    * @api
    */
  def this(options: SourceImageOptions) = this()
}
