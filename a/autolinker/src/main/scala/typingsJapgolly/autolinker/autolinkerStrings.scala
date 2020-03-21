package typingsJapgolly.autolinker

import typingsJapgolly.autolinker.autolinkerMod.HashtagConfig
import typingsJapgolly.autolinker.autolinkerMod.HashtagServices
import typingsJapgolly.autolinker.autolinkerMod.MentionConfig
import typingsJapgolly.autolinker.autolinkerMod.MentionServices
import typingsJapgolly.autolinker.autolinkerMod.UrlMatchTypeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object autolinkerStrings {
  @js.native
  sealed trait `3Dot11Dot1` extends js.Object
  
  @js.native
  sealed trait end extends js.Object
  
  @js.native
  sealed trait facebook
    extends HashtagConfig
       with HashtagServices
  
  @js.native
  sealed trait instagram
    extends HashtagConfig
       with HashtagServices
       with MentionConfig
       with MentionServices
  
  @js.native
  sealed trait middle extends js.Object
  
  @js.native
  sealed trait scheme extends UrlMatchTypeOptions
  
  @js.native
  sealed trait smart extends js.Object
  
  @js.native
  sealed trait soundcloud
    extends MentionConfig
       with MentionServices
  
  @js.native
  sealed trait tld extends UrlMatchTypeOptions
  
  @js.native
  sealed trait twitter
    extends HashtagConfig
       with HashtagServices
       with MentionConfig
       with MentionServices
  
  @js.native
  sealed trait www extends UrlMatchTypeOptions
  
  @scala.inline
  def `3Dot11Dot1`: `3Dot11Dot1` = "3.11.1".asInstanceOf[`3Dot11Dot1`]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def facebook: facebook = "facebook".asInstanceOf[facebook]
  @scala.inline
  def instagram: instagram = "instagram".asInstanceOf[instagram]
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  @scala.inline
  def scheme: scheme = "scheme".asInstanceOf[scheme]
  @scala.inline
  def smart: smart = "smart".asInstanceOf[smart]
  @scala.inline
  def soundcloud: soundcloud = "soundcloud".asInstanceOf[soundcloud]
  @scala.inline
  def tld: tld = "tld".asInstanceOf[tld]
  @scala.inline
  def twitter: twitter = "twitter".asInstanceOf[twitter]
  @scala.inline
  def www: www = "www".asInstanceOf[www]
}

