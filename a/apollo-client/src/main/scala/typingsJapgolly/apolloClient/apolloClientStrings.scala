package typingsJapgolly.apolloClient

import typingsJapgolly.apolloClient.watchQueryOptionsMod.ErrorPolicy
import typingsJapgolly.apolloClient.watchQueryOptionsMod.FetchPolicy
import typingsJapgolly.apolloClient.watchQueryOptionsMod.WatchQueryFetchPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object apolloClientStrings {
  @js.native
  sealed trait `2Dot6Dot8` extends js.Object
  
  @js.native
  sealed trait Document extends js.Object
  
  @js.native
  sealed trait all extends ErrorPolicy
  
  @js.native
  sealed trait `cache-and-network` extends WatchQueryFetchPolicy
  
  @js.native
  sealed trait `cache-first`
    extends FetchPolicy
       with WatchQueryFetchPolicy
  
  @js.native
  sealed trait `cache-only`
    extends FetchPolicy
       with WatchQueryFetchPolicy
  
  @js.native
  sealed trait ignore extends ErrorPolicy
  
  @js.native
  sealed trait `network-only`
    extends FetchPolicy
       with WatchQueryFetchPolicy
  
  @js.native
  sealed trait `no-cache`
    extends FetchPolicy
       with WatchQueryFetchPolicy
  
  @js.native
  sealed trait none extends ErrorPolicy
  
  @js.native
  sealed trait standby
    extends FetchPolicy
       with WatchQueryFetchPolicy
  
  @scala.inline
  def `2Dot6Dot8`: `2Dot6Dot8` = "2.6.8".asInstanceOf[`2Dot6Dot8`]
  @scala.inline
  def Document: Document = "Document".asInstanceOf[Document]
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def `cache-and-network`: `cache-and-network` = "cache-and-network".asInstanceOf[`cache-and-network`]
  @scala.inline
  def `cache-first`: `cache-first` = "cache-first".asInstanceOf[`cache-first`]
  @scala.inline
  def `cache-only`: `cache-only` = "cache-only".asInstanceOf[`cache-only`]
  @scala.inline
  def ignore: ignore = "ignore".asInstanceOf[ignore]
  @scala.inline
  def `network-only`: `network-only` = "network-only".asInstanceOf[`network-only`]
  @scala.inline
  def `no-cache`: `no-cache` = "no-cache".asInstanceOf[`no-cache`]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def standby: standby = "standby".asInstanceOf[standby]
}

