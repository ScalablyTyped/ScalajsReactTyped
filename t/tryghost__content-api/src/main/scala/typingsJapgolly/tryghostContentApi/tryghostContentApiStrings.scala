package typingsJapgolly.tryghostContentApi

import typingsJapgolly.tryghostContentApi.mod.FormatParam
import typingsJapgolly.tryghostContentApi.mod.IncludeParam
import typingsJapgolly.tryghostContentApi.mod.TagVisibility
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object tryghostContentApiStrings {
  @js.native
  sealed trait authors extends IncludeParam
  
  @js.native
  sealed trait canary extends js.Object
  
  @js.native
  sealed trait countDotposts extends IncludeParam
  
  @js.native
  sealed trait draft extends TagVisibility
  
  @js.native
  sealed trait html extends FormatParam
  
  @js.native
  sealed trait plaintext extends FormatParam
  
  @js.native
  sealed trait public extends TagVisibility
  
  @js.native
  sealed trait scheduled extends TagVisibility
  
  @js.native
  sealed trait tags extends IncludeParam
  
  @js.native
  sealed trait v2 extends js.Object
  
  @js.native
  sealed trait v3 extends js.Object
  
  @scala.inline
  def authors: authors = "authors".asInstanceOf[authors]
  @scala.inline
  def canary: canary = "canary".asInstanceOf[canary]
  @scala.inline
  def countDotposts: countDotposts = "count.posts".asInstanceOf[countDotposts]
  @scala.inline
  def draft: draft = "draft".asInstanceOf[draft]
  @scala.inline
  def html: html = "html".asInstanceOf[html]
  @scala.inline
  def plaintext: plaintext = "plaintext".asInstanceOf[plaintext]
  @scala.inline
  def public: public = "public".asInstanceOf[public]
  @scala.inline
  def scheduled: scheduled = "scheduled".asInstanceOf[scheduled]
  @scala.inline
  def tags: tags = "tags".asInstanceOf[tags]
  @scala.inline
  def v2: v2 = "v2".asInstanceOf[v2]
  @scala.inline
  def v3: v3 = "v3".asInstanceOf[v3]
}

