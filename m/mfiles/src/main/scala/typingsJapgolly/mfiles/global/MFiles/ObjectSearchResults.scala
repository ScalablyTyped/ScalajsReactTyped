package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IObjVer
import typingsJapgolly.mfiles.IObjectComparer
import typingsJapgolly.mfiles.IObjectSearchResults
import typingsJapgolly.mfiles.IObjectVersion
import typingsJapgolly.mfiles.IObjectVersions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ObjectSearchResults")
@js.native
open class ObjectSearchResults ()
  extends StObject
     with IObjectSearchResults {
  
  /* CompleteClass */
  override def Clone(): IObjectSearchResults = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def GetAsObjectVersions(): IObjectVersions = js.native
  
  /* CompleteClass */
  override def GetScoreOfObject(ObjVer: IObjVer): Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Double): IObjectVersion = js.native
  
  /* CompleteClass */
  override val MoreResults: Boolean = js.native
  
  /* CompleteClass */
  override def ScoreAt(Index: Double): Double = js.native
  
  /* CompleteClass */
  override def Sort(ObjectComparer: IObjectComparer): Unit = js.native
  
  /* CompleteClass */
  override def SortByScore(Ascending: Boolean): Unit = js.native
}
