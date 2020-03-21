package typingsJapgolly.heredatalens.H.datalens

import typingsJapgolly.heredatalens.H.datalens.Service.Data
import typingsJapgolly.heremaps.H.map.provider.Provider.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Providers define interfaces for layers to access data.
  * The input data can be stored locally or loaded from the network. Data can be loaded by tiles or in one chunk.
  * This provider allows you to supply data stored locally or fetched using external tools.
  */
@JSGlobal("H.datalens.Provider")
@js.native
/**
  * Constructor
  * @param data - JSON object
  * @param options - Configures data accessibility parameters
  */
class Provider ()
  extends typingsJapgolly.heremaps.H.map.provider.Provider {
  def this(data: Data) = this()
  def this(data: Data, options: Options) = this()
  /**
    * Retrieves the provider data.
    * @returns - JSON object
    */
  def getData(): Data = js.native
  /**
    * Updates the provider data. When data is updated, the update event is triggered so that the consuming layers are redrawn.
    * @param data - JSON object
    */
  def setData(data: Data): Unit = js.native
}

