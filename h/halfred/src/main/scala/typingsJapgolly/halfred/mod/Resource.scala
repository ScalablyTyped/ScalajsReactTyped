package typingsJapgolly.halfred.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
  /** Alias for allEmbeddedResourceArrays() */
  def allEmbeddedArrays(): ResourceCollection
  /**
    * Returns an object which has an array for each embedded resource that was present in the
    * source object.
    * See below why each embedded resource is represented as an array. Each element of any of
    * this arrays is in turn a Resource object.
    */
  def allEmbeddedResourceArrays(): ResourceCollection
  /** Alias for allEmbeddedResourceArrays() */
  def allEmbeddedResources(): ResourceCollection
  /**
    * Returns an object which has an array for each link that was present in the source object.
    * See below why each link is represented as an array.
    */
  def allLinkArrays(): LinkCollection
  /** Alias for allLinkArrays() */
  def allLinks(): LinkCollection
  /**
    * Returns the curie with the given name, if any. The returned object is a link object, which
    * means it can be templated etc. See below for link object API.
    */
  def curie(name: String): Link
  /**
    * Returns the array of CURIEs. Each object in the array is a link object, which means it
    * can be templated etc. See below for the link object API.
    */
  def curieArray(): js.Array[Link]
  /** Alias for embeddedResource(key) */
  def embedded(key: String): Resource
  /** Alias for embeddedResourceArray() */
  def embeddedArray(key: String): js.Array[Resource]
  /**
    * Returns the first element of the array of embedded resources for the given key or null if
    * there are no embedded resources for this key. The returend object is a Resource object.
    */
  def embeddedResource(key: String): Resource
  /**
    * Returns the array of embedded resources for the given key, or null if there are no embedded
    * resources for this key. Each element of this arrays is in turn a Resource object.
    */
  def embeddedResourceArray(key: String): js.Array[Resource]
  /**
    * Returns true if the resource has any CURIEs (Compact URIs).
    *
    * @see http://www.w3.org/TR/2010/NOTE-curie-20101216/
    */
  def hasCuries(): Boolean
  /**
    * Returns the first element of the array of links for the given key or null if there are no
    * links for this key.
    */
  def link(key: String): Link
  /**
    * Returns the array of links for the given key, or null if there are no links for this key.
    */
  def linkArray(key: String): js.Array[Link]
  /**
    * Returns the unmodified, original object that was parsed to this resource. This is rather
    * uninteresting for the source object you give to the parse method (because you probably
    * still have a reference to the source object) but it is a convenient way to get the part of
    * the source object that corresponds to an embedded resource.
    */
  def original(): js.Any
  /**
    * Returns the compact URI for the given full URL, if any
    */
  def reverseResolveCurie(fullUrl: String): String
  /**
    * Alias for validationIssues()
    */
  def validation(): js.Any
  /**
    * Returns all validation issues. Validation issues are only gathered if validation has been
    * turned on by calling ``halfred.enableValidation()`` before calling ``halfred.parse``.
    */
  def validationIssues(): js.Any
}

object Resource {
  @scala.inline
  def apply(
    allEmbeddedArrays: CallbackTo[ResourceCollection],
    allEmbeddedResourceArrays: CallbackTo[ResourceCollection],
    allEmbeddedResources: CallbackTo[ResourceCollection],
    allLinkArrays: CallbackTo[LinkCollection],
    allLinks: CallbackTo[LinkCollection],
    curie: String => CallbackTo[Link],
    curieArray: CallbackTo[js.Array[Link]],
    embedded: String => CallbackTo[Resource],
    embeddedArray: String => CallbackTo[js.Array[Resource]],
    embeddedResource: String => CallbackTo[Resource],
    embeddedResourceArray: String => CallbackTo[js.Array[Resource]],
    hasCuries: CallbackTo[Boolean],
    link: String => CallbackTo[Link],
    linkArray: String => CallbackTo[js.Array[Link]],
    original: CallbackTo[js.Any],
    reverseResolveCurie: String => CallbackTo[String],
    validation: CallbackTo[js.Any],
    validationIssues: CallbackTo[js.Any]
  ): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allEmbeddedArrays")(allEmbeddedArrays.toJsFn)
    __obj.updateDynamic("allEmbeddedResourceArrays")(allEmbeddedResourceArrays.toJsFn)
    __obj.updateDynamic("allEmbeddedResources")(allEmbeddedResources.toJsFn)
    __obj.updateDynamic("allLinkArrays")(allLinkArrays.toJsFn)
    __obj.updateDynamic("allLinks")(allLinks.toJsFn)
    __obj.updateDynamic("curie")(js.Any.fromFunction1((t0: java.lang.String) => curie(t0).runNow()))
    __obj.updateDynamic("curieArray")(curieArray.toJsFn)
    __obj.updateDynamic("embedded")(js.Any.fromFunction1((t0: java.lang.String) => embedded(t0).runNow()))
    __obj.updateDynamic("embeddedArray")(js.Any.fromFunction1((t0: java.lang.String) => embeddedArray(t0).runNow()))
    __obj.updateDynamic("embeddedResource")(js.Any.fromFunction1((t0: java.lang.String) => embeddedResource(t0).runNow()))
    __obj.updateDynamic("embeddedResourceArray")(js.Any.fromFunction1((t0: java.lang.String) => embeddedResourceArray(t0).runNow()))
    __obj.updateDynamic("hasCuries")(hasCuries.toJsFn)
    __obj.updateDynamic("link")(js.Any.fromFunction1((t0: java.lang.String) => link(t0).runNow()))
    __obj.updateDynamic("linkArray")(js.Any.fromFunction1((t0: java.lang.String) => linkArray(t0).runNow()))
    __obj.updateDynamic("original")(original.toJsFn)
    __obj.updateDynamic("reverseResolveCurie")(js.Any.fromFunction1((t0: java.lang.String) => reverseResolveCurie(t0).runNow()))
    __obj.updateDynamic("validation")(validation.toJsFn)
    __obj.updateDynamic("validationIssues")(validationIssues.toJsFn)
    __obj.asInstanceOf[Resource]
  }
}

