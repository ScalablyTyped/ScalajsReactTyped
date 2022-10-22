package typingsJapgolly.heremaps.global.H.map

import typingsJapgolly.heremaps.H.map.ArrowStyle.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents style attributes for arrows to be rendered along a polyline. A ArrowStyle instance is always treated as immutable to avoid inconstiencies and must not modified.
  */
@JSGlobal("H.map.ArrowStyle")
@js.native
/**
  * Constructor
  * @param opt_options {(H.map.ArrowStyle | H.map.ArrowStyle.Options)=}
  */
open class ArrowStyle ()
  extends StObject
     with typingsJapgolly.heremaps.H.map.ArrowStyle {
  def this(opt_options: typingsJapgolly.heremaps.H.map.ArrowStyle) = this()
  def this(opt_options: Options) = this()
}
