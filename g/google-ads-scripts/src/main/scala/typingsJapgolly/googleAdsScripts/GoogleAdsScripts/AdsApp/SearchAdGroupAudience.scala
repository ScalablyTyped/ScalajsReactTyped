package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads audience, either USER_INTEREST or USER_LIST, configured for search ad groups. */
@js.native
trait SearchAdGroupAudience
  extends StObject
     with StatsFor {
  
  /** Provides access to this audience's bidding fields. */
  def bidding(): SearchAudienceBidding = js.native
  
  /** Returns the ad group to which this audience belongs. */
  def getAdGroup(): AdGroup = js.native
  
  /** Returns the audience ID of the audience. */
  def getAudienceId(): Double = js.native
  
  /** Returns the type of the audience, either USER_INTEREST or USER_LIST. */
  def getAudienceType(): String = js.native
  
  /** Returns the base ad group to which this audience belongs. */
  def getBaseAdGroup(): AdGroup = js.native
  
  /** Returns the base campaign to which this audience belongs. */
  def getBaseCampaign(): Campaign = js.native
  
  /** Returns the campaign to which this audience belongs or null if it does not belong to a search or display campaign. */
  def getCampaign(): Campaign = js.native
  
  /** Returns the ID of the criterion. */
  def getId(): Double = js.native
  
  /** Returns the name of the audience. */
  def getName(): String = js.native
  
  /** Returns true if the audience is enabled. */
  def isEnabled(): Boolean = js.native
  
  /** Returns true if the audience is paused. */
  def isPaused(): Boolean = js.native
  
  /** Removes the audience. */
  def remove(): Unit = js.native
}
