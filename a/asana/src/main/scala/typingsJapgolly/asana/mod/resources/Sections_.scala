package typingsJapgolly.asana.mod.resources

import typingsJapgolly.asana.mod.resources.Sections.SectionsParams
import typingsJapgolly.asana.mod.resources.Sections.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sections_ extends Resource {
  /**
    * * Adds the specified task to a specific section of project. Returns empty object.
    * @param {String} section The section to add task to.
    * @param {Object} data Data for the request
    * @param {String} data.task The id of task to be added to specified section.
    * @param {String} data.insert_after An existing task within this section after which the added task should be inserted. Cannot be provided together with insert_before.
    * @param {String} data.insert_before An existing task within this section before which the added task should be inserted. Cannot be provided together with insert_after.
    * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    * @return {Promise} The response from the API
    */
  def addTask(section: String, data: SectionsParams): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  def addTask(section: String, data: SectionsParams, dispatchOptions: js.Any): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  def addTask(section: Double, data: SectionsParams): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  def addTask(section: Double, data: SectionsParams, dispatchOptions: js.Any): typingsJapgolly.bluebird.mod.^[js.Object] = js.native
  /**
    * Returns the complete record for a single section.
    * @param {String} section The section to get.
    * @param {Object} [params] Parameters for the request
    * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    * @return {Promise} The requested resource
    */
  def findById(section: String): typingsJapgolly.bluebird.mod.^[Type] = js.native
  def findById(section: String, params: Params): typingsJapgolly.bluebird.mod.^[Type] = js.native
  def findById(section: String, params: Params, dispatchOptions: js.Any): typingsJapgolly.bluebird.mod.^[Type] = js.native
  def findById(section: Double): typingsJapgolly.bluebird.mod.^[Type] = js.native
  def findById(section: Double, params: Params): typingsJapgolly.bluebird.mod.^[Type] = js.native
  def findById(section: Double, params: Params, dispatchOptions: js.Any): typingsJapgolly.bluebird.mod.^[Type] = js.native
  /**
    * Returns the compact records for all sections in the specified project.
    * @param {String} project The project to get sections from.
    * @param {Object} [params] Parameters for the request
    * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    * @return {Promise} The response from the API
    */
  def findByProject(project: String): typingsJapgolly.bluebird.mod.^[js.Array[Type]] = js.native
  def findByProject(project: String, params: Params): typingsJapgolly.bluebird.mod.^[js.Array[Type]] = js.native
  def findByProject(project: String, params: Params, dispatchOptions: js.Any): typingsJapgolly.bluebird.mod.^[js.Array[Type]] = js.native
  def findByProject(project: Double): typingsJapgolly.bluebird.mod.^[js.Array[Type]] = js.native
  def findByProject(project: Double, params: Params): typingsJapgolly.bluebird.mod.^[js.Array[Type]] = js.native
  def findByProject(project: Double, params: Params, dispatchOptions: js.Any): typingsJapgolly.bluebird.mod.^[js.Array[Type]] = js.native
}

