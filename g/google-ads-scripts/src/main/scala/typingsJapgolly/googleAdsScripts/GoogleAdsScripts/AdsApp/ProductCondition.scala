package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a product condition. */
@js.native
trait ProductCondition
  extends StObject
     with StatsFor {
  
  /** Returns a selector of the child product groups of this product condition. */
  def children(): ProductGroupSelector = js.native
  
  /** Converts the product condition into a negative product condition. */
  def exclude(): Unit = js.native
  
  /** Returns the shopping ad group to which this product condition belongs. */
  def getAdGroup(): ShoppingAdGroup = js.native
  
  /** Returns the shopping campaign to which this product condition belongs. */
  def getCampaign(): ShoppingCampaign = js.native
  
  /** Returns the name of the product condition. */
  def getCondition(): String = js.native
  
  /** Returns the type of this entity as a String, in this case, "ProductCondition". */
  def getEntityType(): String = js.native
  
  /** Returns the ID of the product condition. */
  def getId(): Double = js.native
  
  /** Returns the max cpc bid of the product condition, in the currency of the account. */
  def getMaxCpc(): Double = js.native
  
  /** Returns the value of the product condition or null if this is the root product group. */
  def getValue(): String = js.native
  
  /** Converts the product condition into a positive product condition. */
  def include(): Unit = js.native
  
  /** Returns true if this is an excluded product condition. */
  def isExcluded(): Boolean = js.native
  
  /** Returns true if the product condition is a catch-all product condition. */
  def isOtherCase(): Boolean = js.native
  
  /** Returns access to the product group builder space or null if the product condition is excluded. */
  def newChild(): ProductGroupBuilderSpace = js.native
  
  /** Returns the parent product group of this product condition or null if this is the root product group. */
  def parent(): ProductGroup = js.native
  
  /** Removes the product condition. */
  def remove(): Unit = js.native
  
  /** Will remove all child product groups of this product condition. */
  def removeAllChildren(): Unit = js.native
  
  /** Sets the max cpc bid of the product condition to the specified value. */
  def setMaxCpc(maxCpc: Double): Unit = js.native
}
