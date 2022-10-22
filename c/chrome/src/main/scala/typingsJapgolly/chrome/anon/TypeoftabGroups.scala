package typingsJapgolly.chrome.anon

import typingsJapgolly.chrome.chrome.tabGroups.MoveProperties
import typingsJapgolly.chrome.chrome.tabGroups.QueryInfo
import typingsJapgolly.chrome.chrome.tabGroups.TabGroup
import typingsJapgolly.chrome.chrome.tabGroups.TabGroupCreatedEvent
import typingsJapgolly.chrome.chrome.tabGroups.TabGroupMovedEvent
import typingsJapgolly.chrome.chrome.tabGroups.TabGroupRemovedEvent
import typingsJapgolly.chrome.chrome.tabGroups.TabGroupUpdated
import typingsJapgolly.chrome.chrome.tabGroups.UpdateProperties
import typingsJapgolly.chrome.chromeInts.`-1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeoftabGroups extends StObject {
  
  var TAB_GROUP_ID_NONE: `-1` = js.native
  
  def get(groupId: Double): js.Promise[TabGroup] = js.native
  def get(groupId: Double, callback: js.Function1[/* group */ TabGroup, Unit]): Unit = js.native
  
  def move(groupId: Double, moveProperties: MoveProperties): Unit = js.native
  def move(
    groupId: Double,
    moveProperties: MoveProperties,
    callback: js.Function1[/* group */ TabGroup, Unit]
  ): Unit = js.native
  @JSName("move")
  def move_Promise(groupId: Double, moveProperties: MoveProperties): js.Promise[TabGroup] = js.native
  
  var onCreated: TabGroupCreatedEvent = js.native
  
  var onMoved: TabGroupMovedEvent = js.native
  
  var onRemoved: TabGroupRemovedEvent = js.native
  
  var onUpdated: TabGroupUpdated = js.native
  
  def query(queryInfo: QueryInfo): js.Promise[js.Array[TabGroup]] = js.native
  def query(queryInfo: QueryInfo, callback: js.Function1[/* result */ js.Array[TabGroup], Unit]): Unit = js.native
  
  def update(groupId: Double, updateProperties: UpdateProperties): Unit = js.native
  def update(
    groupId: Double,
    updateProperties: UpdateProperties,
    callback: js.Function1[/* group */ TabGroup, Unit]
  ): Unit = js.native
  @JSName("update")
  def update_Promise(groupId: Double, updateProperties: UpdateProperties): js.Promise[TabGroup] = js.native
}
