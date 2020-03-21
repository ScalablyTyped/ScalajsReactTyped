package typingsJapgolly.umbraco.umbraco.resources

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.dataTypeResource
  * @description Loads in data for data types
  **/
trait IDataTypeResource extends js.Object {
  /**
    * @ngdoc method
    * @name umbraco.resources.dataTypeResource#deleteById
    * @methodOf umbraco.resources.dataTypeResource
    *
    * @description
    * Deletes a data type with a given id
    *
    * ##usage
    * <pre>
    * dataTypeResource.deleteById(1234)
    *    .then(function() {
    *        alert('its gone!');
    *    });
    * </pre>
    *
    * @param {Int} id id of content item to delete
    * @returns {Promise} resourcePromise object.
    *
    */
  def deleteById(id: Double): IPromise[IResourcePromise]
  def getAll(): js.Any
  /**
    * @ngdoc method
    * @name umbraco.resources.dataTypeResource#getById
    * @methodOf umbraco.resources.dataTypeResource
    *
    * @description
    * Gets a data type item with a given id
    *
    * ##usage
    * <pre>
    * dataTypeResource.getById(1234)
    *    .then(function() {
    *        alert('its gone!');
    *    });
    * </pre>
    *
    * @param {Int} id id of data type to retrieve
    * @returns {Promise} resourcePromise object.
    *
    */
  def getById(id: Double): IPromise[IResourcePromise]
  /**
    * @ngdoc method
    * @name umbraco.resources.dataTypeResource#getPreValues
    * @methodOf umbraco.resources.dataTypeResource
    *
    * @description
    * Retrieves available prevalues for a given data type + editor
    *
    * ##usage
    * <pre>
    * dataTypeResource.getPrevalyes("Umbraco.MediaPicker", 1234)
    *    .then(function(prevalues) {
    *        alert('its gone!');
    *    });
    * </pre>
    *
    * @param {String} editorAlias string alias of editor type to retrive prevalues configuration for
    * @param {Int} id id of datatype to retrieve prevalues for
    * @returns {Promise} resourcePromise object.
    *
    */
  def getPreValues(editorAlias: String, dataTypeId: Double): IPromise[IResourcePromise]
  /**
    * @ngdoc method
    * @name umbraco.resources.contentResource#getScaffold
    * @methodOf umbraco.resources.contentResource
    *
    * @description
    * Returns a scaffold of an empty data type item
    *
    * The scaffold is used to build editors for data types that has not yet been populated with data.
    *
    * ##usage
    * <pre>
    * dataTypeResource.getScaffold()
    *    .then(function(scaffold) {
    *        var myType = scaffold;
    *        myType.name = "My new data type";
    *
    *        dataTypeResource.save(myType, myType.preValues, true)
    *            .then(function(type){
    *                alert("Retrieved, updated and saved again");
    *            });
    *    });
    * </pre>
    *
    * @returns {Promise} resourcePromise object containing the data type scaffold.
    *
    */
  def getScaffold(): IPromise[IResourcePromise]
  /**
    * @ngdoc method
    * @name umbraco.resources.dataTypeResource#save
    * @methodOf umbraco.resources.dataTypeResource
    *
    * @description
    * Saves or update a data type
    *
    * @param {Object} dataType data type object to create/update
    * @param {Array} preValues collection of prevalues on the datatype
    * @param {Bool} isNew set to true if type should be create instead of updated
    * @returns {Promise} resourcePromise object.
    *
    */
  def save(dataType: js.Object, preValues: js.Array[_], isNew: Boolean): IPromise[IResourcePromise]
}

object IDataTypeResource {
  @scala.inline
  def apply(
    deleteById: Double => CallbackTo[IPromise[IResourcePromise]],
    getAll: CallbackTo[js.Any],
    getById: Double => CallbackTo[IPromise[IResourcePromise]],
    getPreValues: (String, Double) => CallbackTo[IPromise[IResourcePromise]],
    getScaffold: CallbackTo[IPromise[IResourcePromise]],
    save: (js.Object, js.Array[js.Any], Boolean) => CallbackTo[IPromise[IResourcePromise]]
  ): IDataTypeResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deleteById")(js.Any.fromFunction1((t0: scala.Double) => deleteById(t0).runNow()))
    __obj.updateDynamic("getAll")(getAll.toJsFn)
    __obj.updateDynamic("getById")(js.Any.fromFunction1((t0: scala.Double) => getById(t0).runNow()))
    __obj.updateDynamic("getPreValues")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => getPreValues(t0, t1).runNow()))
    __obj.updateDynamic("getScaffold")(getScaffold.toJsFn)
    __obj.updateDynamic("save")(js.Any.fromFunction3((t0: js.Object, t1: js.Array[js.Any], t2: scala.Boolean) => save(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IDataTypeResource]
  }
}

