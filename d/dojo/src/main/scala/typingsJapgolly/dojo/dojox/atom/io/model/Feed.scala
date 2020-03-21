package typingsJapgolly.dojo.dojox.atom.io.model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/atom/io/model.Feed.html
  *
  * Class container for 'Feed' types.
  *
  * @param args
  */
@JSGlobal("dojox.atom.io.model.Feed")
@js.native
class Feed protected () extends js.Object {
  def this(args: js.Any) = this()
  /**
    *
    * @param tag
    */
  def accept(tag: js.Any): js.Any = js.native
  /**
    *
    * @param name
    * @param value
    */
  def addAttribute(name: js.Any, value: js.Any): Unit = js.native
  /**
    * Function to add in an author to the list of authors.
    *
    * @param name The author's name.
    * @param email The author's e-mail address.
    * @param uri A URI associated with the author.
    */
  def addAuthor(name: String, email: String, uri: String): Unit = js.native
  /**
    * Function to add in a category to the list of categories.
    *
    * @param scheme
    * @param term
    * @param label
    */
  def addCategory(scheme: String, term: String, label: String): Unit = js.native
  /**
    *
    * @param content
    */
  def addContent(content: js.Any): Unit = js.native
  /**
    * Function to add in an author to the list of authors.
    *
    * @param name The author's name.
    * @param email The author's e-mail address.
    * @param uri A URI associated with the author.
    */
  def addContributor(name: String, email: String, uri: String): Unit = js.native
  /**
    * Function to add an entry to this feed.
    *
    * @param entry The entry object to add.
    */
  def addEntry(entry: js.Object): Unit = js.native
  /**
    * Function to add in an extension namespace into the item.
    *
    * @param name_space The namespace of the extension.
    * @param name The name of the extension
    * @param attributes The attributes associated with the extension.
    * @param content The content of the extension.
    * @param shortNS
    */
  def addExtension(name_space: String, name: String, attributes: js.Array[_], content: String, shortNS: String): Unit = js.native
  /**
    * Function to add in a link to the list of links.
    *
    * @param href
    * @param rel
    * @param hrefLang
    * @param title A title to associate with the link.
    * @param type The type of link is is.
    */
  def addLink(href: String, rel: String, hrefLang: String, title: String, `type`: String): Unit = js.native
  /**
    *
    * @param fullName
    * @param shortName
    */
  def addNamespace(fullName: js.Any, shortName: js.Any): Unit = js.native
  /**
    *
    * @param node
    */
  def buildFromDom(node: js.Any): Unit = js.native
  /**
    * Function to Create a new entry object in the feed.
    *
    */
  def createEntry(): js.Any = js.native
  /**
    *
    */
  def destroy(): Unit = js.native
  /**
    *
    * @param name
    */
  def getAttribute(name: js.Any): js.Any = js.native
  /**
    * Function to get all categories that match a particular scheme.
    *
    * @param scheme The scheme to filter on.
    */
  def getCategories(scheme: String): js.Any = js.native
  /**
    * Function to get an entry by its id.
    *
    * @param entryId
    */
  def getEntry(entryId: String): js.Any = js.native
  /**
    * Function to get extensions that match a namespace and name.
    *
    * @param name_space The namespace of the extension.
    * @param name The name of the extension
    */
  def getExtensions(name_space: String, name: String): js.Array[_] = js.native
  /**
    * Function to get the first entry of the feed.
    *
    */
  def getFirstEntry(): js.Any = js.native
  /**
    * Function to get the href that refers to this feed.
    *
    */
  def getSelfHref(): js.Any = js.native
  /**
    * Function to remove all basic links from the list of links.
    *
    */
  def removeBasicLinks(): Double = js.native
  /**
    * Function to remove all categories that match a particular scheme and term.
    *
    * @param scheme The scheme to filter on.
    * @param term The term to filter on.
    */
  def removeCategories(scheme: String, term: String): Double = js.native
  /**
    * Function to remove an entry from the list of links.
    *
    * @param entry The entry.
    */
  def removeEntry(entry: js.Object): Double = js.native
  /**
    * Function to remove extensions that match a namespace and name.
    *
    * @param name_space The namespace of the extension.
    * @param name The name of the extension
    */
  def removeExtensions(name_space: String, name: String): Unit = js.native
  /**
    * Function to remove a link from the list of links.
    *
    * @param href The href.
    * @param rel
    */
  def removeLink(href: String, rel: String): Double = js.native
  /**
    * Function to add a set of entries to the feed.
    *
    * @param arrayOfEntry An array of entry objects to add to the feed.
    */
  def setEntries(arrayOfEntry: js.Array[_]): Unit = js.native
  /**
    * Function to set the title of the item.
    *
    * @param str The title to set.
    * @param type The type of title format, text, xml, xhtml, etc.
    */
  def setTitle(str: String, `type`: String): Unit = js.native
}

