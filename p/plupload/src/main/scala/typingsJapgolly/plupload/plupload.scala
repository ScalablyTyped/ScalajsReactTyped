package typingsJapgolly.plupload

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("plupload")
@js.native
object plupload extends js.Object {
  @js.native
  class Uploader protected () extends js.Object {
    def this(settings: pluploadSettings) = this()
    /**
    		 * Map of features that are available for the uploader runtime. Features will be filled
    		 * before the init event is called, these features can then be used to alter the UI for the end user.
    		 * Some of the current features that might be in this map is: dragdrop, chunks, jpgresize, pngresize.
    		 *
    		 * @property features
    		 * @type Object
    		 */
    var features: js.Any = js.native
    /**
    		 * Current upload queue, an array of File instances.
    		 *
    		 * @property files
    		 * @type Array
    		 * @see plupload.File
    		 */
    var files: js.Array[_] = js.native
    /**
    		 * Unique id for the Uploader instance.
    		 *
    		 * @property id
    		 * @type String
    		 */
    var id: String = js.native
    /**
    		 * Current runtime name.
    		 *
    		 * @property runtime
    		 * @type String
    		 */
    var runtime: String = js.native
    /**
    		 * Object with name/value settings.
    		 *
    		 * @property settings
    		 * @type Object
    		 */
    var settings: js.Any = js.native
    /**
    		 * Current state of the total uploading progress. This one can either be plupload.STARTED or plupload.STOPPED.
    		 * These states are controlled by the stop/start methods. The default value is STOPPED.
    		 *
    		 * @property state
    		 * @type Number
    		 */
    var state: Double = js.native
    /**
    		 * Total progess information. How many files has been uploaded, total percent etc.
    		 *
    		 * @property total
    		 * @type plupload.QueueProgress
    		 */
    var total: pluploadQueueProgress = js.native
    /**
    		 * Adds file to the queue programmatically. Can be native file, instance of Plupload.File,
    		 * instance of mOxie.File, input[type="file"] element, or array of these. Fires FilesAdded,
    		 * if any files were added to the queue. Otherwise nothing happens.
    		 *
    		 * @method addFile
    		 * @since 2.0
    		 * @param {plupload.File|mOxie.File|File|Node|Array} file File or files to add to the queue.
    		 * @param {String} [fileName] If specified, will be used as a name for the file
    		 */
    def addFile(file: js.Any): Unit = js.native
    def addFile(file: js.Any, fileName: String): Unit = js.native
    def bind(name: String, func: js.Any): js.Any = js.native
    def bind(name: String, func: js.Any, scope: js.Any): js.Any = js.native
    def destroy(): js.Any = js.native
    /**
    		 * Disables/enables browse button on request.
    		 *
    		 * @method disableBrowse
    		 * @param {Boolean} disable Whether to disable or enable (default: true)
    		 */
    def disableBrowse(disable: Boolean): Unit = js.native
    // TODO: Make plupload.File typing
    /**
    		 * Returns the specified file object by id.
    		 *
    		 * @method getFile
    		 * @param {String} id File id to look for.
    		 * @return {plupload.File} File object or undefined if it wasn't found;
    		 */
    def getFile(id: String): js.Any = js.native
    /**
    		 * Get the value for the specified option or the whole configuration, if not specified.
    		 *
    		 * @method getOption
    		 * @since 2.1
    		 * @param {String} [option] Name of the option to get
    		 * @return {Mixed} Value for the option or the whole set
    		 */
    def getOption(): js.Any = js.native
    def getOption(option: String): js.Any = js.native
    def hasEventListener(name: String): js.Any = js.native
    /**
    		 * Initializes the Uploader instance and adds internal event listeners.
    		 *
    		 * @method init
    		 */
    def init(): Unit = js.native
    /**
    		 * Refreshes the upload instance by dispatching out a refresh event to all runtimes.
    		 * This would for example reposition flash/silverlight shims on the page.
    		 *
    		 * @method refresh
    		 */
    def refresh(): Unit = js.native
    /**
    		 * Removes a specific file.
    		 *
    		 * @method removeFile
    		 * @param {plupload.File|String} file File to remove from queue.
    		 */
    def removeFile(file: js.Any): js.Any = js.native
    /**
    		 * Set the value for the specified option(s).
    		 *
    		 * @method setOption
    		 * @since 2.1
    		 * @param {String|Object} option Name of the option to change or the set of key/value pairs
    		 * @param {Mixed} [value] Value for the option (is ignored, if first argument is object)
    		 */
    def setOption(option: String): Unit = js.native
    def setOption(option: String, value: js.Any): Unit = js.native
    def setOption(option: js.Any): Unit = js.native
    def setOption(option: js.Any, value: js.Any): Unit = js.native
    /**
    		 * Removes part of the queue and returns the files removed. This will also trigger the
    		 * FilesRemoved and QueueChanged events.
    		 *
    		 * @method splice
    		 * @param {Number} [start=0] Start index to remove from.
    		 * @param {Number} [length] Number of files to remove (defaults to number of files in the queue).
    		 * @return {Array} Array of files that was removed.
    		 */
    def splice(): js.Any = js.native
    def splice(start: Double): js.Any = js.native
    def splice(start: Double, length: Double): js.Any = js.native
    /**
    		 * Starts uploading the queued files.
    		 *
    		 * @method start
    		 */
    def start(): Unit = js.native
    /**
    		 * Stops the upload of the queued files.
    		 *
    		 * @method stop
    		 */
    def stop(): Unit = js.native
    /**
    		 * Dispatches the specified event name and its arguments to all listeners.
    		 * @method trigger
    	 	 * @param {String} name Event name to fire.
      * @param {Object..} Multiple arguments to pass along to the listener functions.
    		*/
    def trigger(name: String, Multiple: js.Any): js.Any = js.native
    def unbind(name: String, func: js.Any): js.Any = js.native
    def unbindAll(): js.Any = js.native
  }
  
  val DONE: Double = js.native
  val FAILED: Double = js.native
  val FILE_DUPLICATE_ERROR: Double = js.native
  val FILE_EXTENSION_ERROR: Double = js.native
  val FILE_SIZE_ERROR: Double = js.native
  val GENERIC_ERROR: Double = js.native
  val HTTP_ERROR: Double = js.native
  val IMAGE_DIMENSIONS_ERROR: Double = js.native
  val IMAGE_FORMAT_ERROR: Double = js.native
  val INIT_ERROR: Double = js.native
  val IO_ERROR: Double = js.native
  val MEMORY_ERROR: Double = js.native
  val QUEUED: Double = js.native
  val SECURITY_ERROR: Double = js.native
  val STARTED: Double = js.native
  val STOPPED: Double = js.native
  val UPLOADING: Double = js.native
  val VERSION: String = js.native
  val mimeTypes: js.Any = js.native
  val ua: js.Any = js.native
  /**
    * Adds specified className to specified DOM element.
    *
    * @method addClass
    * @static
    * @param {Object} obj DOM element like object to add handler to.
    * @param {String} name Class name
    */
  def addClass(obj: js.Any, name: String): js.Any = js.native
  /**
    * Adds an event handler to the specified object and store reference to the handler
    * in objects internal Plupload registry (@see removeEvent).
    *
    * @method addEvent
    * @static
    * @param {Object} obj DOM element like object to add handler to.
    * @param {String} name Name to add event listener to.
    * @param {Function} callback Function to call when event occurs.
    * @param {String} (optional) key that might be used to add specifity to the event record.
    */
  def addEvent(obj: js.Any, name: String, callback: js.Function): js.Any = js.native
  def addEvent(obj: js.Any, name: String, callback: js.Function, key: String): js.Any = js.native
  /**
    * Registers a filter that will be executed for each file added to the queue.
    * If callback returns false, file will not be added.
    *
    * Callback receives two arguments: a value for the filter as it was specified in settings.filters
    * and a file to be filtered. Callback is executed in the context of uploader instance.
    *
    * @method addFileFilter
    * @static
    * @param {String} name Name of the filter by which it can be referenced in settings.filters
    * @param {String} cb Callback - the actual routine that every added file must pass
    */
  def addFileFilter(name: String, cb: js.Function): Unit = js.native
  /**
    * Extends the language pack object with new items.
    *
    * @method addI18n
    * @static
    * @param {Object} pack Language pack items to add.
    * @return {Object} Extended language pack object.
    */
  def addI18n(pack: js.Any): js.Any = js.native
  /**
    * Builds a full url out of a base URL and an object with items to append as query string items.
    *
    * @method buildUrl
    * @static
    * @param {String} url Base URL to append query string items to.
    * @param {Object} items Name/value object to serialize as a querystring.
    * @return {String} String with url + serialized query string items.
    */
  def buildUrl(url: String, items: js.Any): String = js.native
  /**
    * Cleans the specified name from national characters (diacritics). The result will be a name with only a-z, 0-9 and _.
    *
    * @method cleanName
    * @static
    * @param {String} s String to clean up.
    * @return {String} Cleaned string.
    */
  def cleanName(name: String): String = js.native
  /** Utility methods **/
  /**
    * Executes the callback function for each item in array/object. If you return false in the
    * callback it will break the loop.
    *
    * @method each
    * @static
    * @param {Object} obj Object to iterate.
    * @param {function} callback Callback function to execute for each item.
    */
  def each(obj: js.Any, callback: js.Function): Unit = js.native
  /**
    * Extends the specified object with another object.
    *
    * @method extend
    * @static
    * @param {Object} target Object to extend.
    * @param {Object..} obj Multiple objects to extend with.
    * @return {Object} Same as target, the extended object.
    */
  def extend(target: js.Any): js.Any = js.native
  /**
    * Formats the specified number as a size string for example 1024 becomes 1 KB.
    *
    * @method formatSize
    * @static
    * @param {Number} size Size to format as string.
    * @return {String} Formatted size string.
    */
  def formatSize(size: Double): String = js.native
  /**
    * Returns the absolute x, y position of an Element. The position will be returned in a object with x, y fields.
    *
    * @method getPos
    * @static
    * @param {Element} node HTML element or element id to get x, y position from.
    * @param {Element} root Optional root element to stop calculations at.
    * @return {object} Absolute position of the specified element object with x, y fields.
    */
  def getPos(node: Element, root: Element): js.Any = js.native
  /**
    * Returns the size of the specified node in pixels.
    *
    * @method getSize
    * @static
    * @param {Node} node Node to get the size of.
    * @return {Object} Object with a w and h property.
    */
  def getSize(node: Node): js.Any = js.native
  /**
    * Returns a given computed style of a DOM element.
    *
    * @method getStyle
    * @static
    * @param {Object} obj DOM element like object.
    * @param {String} name Style you want to get from the DOM element
    */
  def getStyle(obj: js.Any, name: String): js.Any = js.native
  /**
    * Generates an unique ID. This is 99.99% unique since it takes the current time and 5 random numbers.
    * The only way a user would be able to get the same ID is if the two persons at the same exact millisecond manages
    * to get 5 the same random numbers between 0-65535 it also uses a counter so each call will be guaranteed to be page unique.
    * It's more probable for the earth to be hit with an asteriod. You can also if you want to be 100% sure set the plupload.guidPrefix property
    * to an user unique key.
    *
    * @method guid
    * @static
    * @return {String} Virtually unique id.
    */
  def guid(guid: String): String = js.native
  /**
    * Checks if specified DOM element has specified class.
    *
    * @method hasClass
    * @static
    * @param {Object} obj DOM element like object to add handler to.
    * @param {String} name Class name
    */
  def hasClass(obj: js.Any, name: String): js.Any = js.native
  /**
    * Find an element in array and return its index if present, otherwise return -1.
    *
    * @method inArray
    * @static
    * @param {mixed} needle Element to find
    * @param {Array} array
    * @return {Int} Index of the element, or -1 if not found
    */
  def inArray(needle: js.Any, array: js.Array[_]): Double = js.native
  /**
    Recieve an array of functions (usually async) to call in sequence, each  function
    receives a callback as first argument that it should call, when it completes. Finally,
    after everything is complete, main callback is called. Passing truthy value to the
    callback as a first argument will interrupt the sequence and invoke main callback
    immediately.
    @method inSeries
    @static
    @param {Array} queue Array of functions to call in sequence
    @param {Function} cb Main callback that is called in the end, or in case of error
    */
  def inSeries(queue: js.Array[_], callback: js.Function): Unit = js.native
  /**
    * Checks if object is empty.
    *
    * @method isEmptyObj
    * @static
    * @param {Object} obj Object to check.
    * @return {Boolean}
    */
  def isEmptyObj(obj: js.Any): Boolean = js.native
  def parseSize(size: String): Double = js.native
  /**
    * Parses the specified size string into a byte value. For example 10kb becomes 10240.
    *
    * @method parseSize
    * @static
    * @param {String|Number} size String to parse or number to just pass through.
    * @return {Number} Size in bytes.
    */
  def parseSize(size: Double): Double = js.native
  /**
    * A way to predict what runtime will be choosen in the current environment with the
    * specified settings.
    *
    * @method predictRuntime
    * @static
    * @param {Object|String} config Plupload settings to check
    * @param {String} [runtimes] Comma-separated list of runtimes to check against
    * @return {String} Type of compatible runtime
    */
  def predictRuntime(config: js.Any, runtimes: String): String = js.native
  /**
    * Remove all kind of events from the specified object
    *
    * @method removeAllEvents
    * @static
    * @param {Object} obj DOM element to remove event listeners from.
    * @param {String} (optional) unique key to match, when removing events.
    */
  def removeAllEvents(obj: js.Any): js.Any = js.native
  def removeAllEvents(obj: js.Any, key: String): js.Any = js.native
  /**
    * Removes specified className from specified DOM element.
    *
    * @method removeClass
    * @static
    * @param {Object} obj DOM element like object to add handler to.
    * @param {String} name Class name
    */
  def removeClass(obj: js.Any, name: String): js.Any = js.native
  /**
    * Remove event handler from the specified object. If third argument (callback)
    * is not specified remove all events with the specified name.
    *
    * @method removeEvent
    * @static
    * @param {Object} obj DOM element to remove event listener(s) from.
    * @param {String} name Name of event listener to remove.
    * @param {Function|String} (optional) might be a callback or unique key to match.
    */
  def removeEvent(obj: js.Any, name: String): js.Any = js.native
  def removeEvent(obj: js.Any, name: String, optional: String): js.Any = js.native
  def removeEvent(obj: js.Any, name: String, optional: js.Function): js.Any = js.native
  /**
    * Pseudo sprintf implementation - simple way to replace tokens with specified values.
    *
    * @param {String} str String with tokens
    * @return {String} String with replaced tokens
    */
  def sprintf(str: String): String = js.native
  /**
    * Forces anything into an array.
    *
    * @method toArray
    * @static
    * @param {Object} obj Object with length field.
    * @return {Array} Array object containing all items.
    */
  def toArray(obj: js.Any): js.Array[_] = js.native
  /**
    * Translates the specified string by checking for the english string in the language pack lookup.
    *
    * @method translate
    * @static
    * @param {String} str String to look for.
    * @return {String} Translated string or the input string if it wasn't found.
    */
  def translate(str: String): String = js.native
  /**
    * Gets the true type of the built-in object (better version of typeof).
    * @credits Angus Croll (http://javascriptweblog.wordpress.com/)
    *
    * @method typeOf
    * @static
    * @param {Object} o Object to check.
    * @return {String} Object [[Class]]
    */
  def typeOf(o: js.Any): String = js.native
  /**
    * Encodes the specified string.
    *
    * @method xmlEncode
    * @static
    * @param {String} s String to encode.
    * @return {String} Encoded string.
    */
  def xmlEncode(str: String): String = js.native
}

