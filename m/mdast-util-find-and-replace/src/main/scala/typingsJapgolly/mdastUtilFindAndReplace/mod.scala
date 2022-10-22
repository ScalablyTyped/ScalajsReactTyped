package typingsJapgolly.mdastUtilFindAndReplace

import typingsJapgolly.mdastUtilFindAndReplace.libMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-util-find-and-replace", "findAndReplace")
  @js.native
  val findAndReplace: (js.Function4[
    /* tree */ Node, 
    /* find */ typingsJapgolly.mdastUtilFindAndReplace.libMod.Find, 
    /* replace */ js.UndefOr[typingsJapgolly.mdastUtilFindAndReplace.libMod.Replace], 
    /* options */ js.UndefOr[typingsJapgolly.mdastUtilFindAndReplace.libMod.Options], 
    Node
  ]) & (js.Function3[
    /* tree */ Node, 
    /* schema */ typingsJapgolly.mdastUtilFindAndReplace.libMod.FindAndReplaceSchema | typingsJapgolly.mdastUtilFindAndReplace.libMod.FindAndReplaceList, 
    /* options */ js.UndefOr[typingsJapgolly.mdastUtilFindAndReplace.libMod.Options], 
    Node
  ]) = js.native
  
  type Find = typingsJapgolly.mdastUtilFindAndReplace.libMod.Find
  
  type FindAndReplaceList = typingsJapgolly.mdastUtilFindAndReplace.libMod.FindAndReplaceList
  
  type FindAndReplaceSchema = typingsJapgolly.mdastUtilFindAndReplace.libMod.FindAndReplaceSchema
  
  type FindAndReplaceTuple = typingsJapgolly.mdastUtilFindAndReplace.libMod.FindAndReplaceTuple
  
  type Options = typingsJapgolly.mdastUtilFindAndReplace.libMod.Options
  
  type RegExpMatchObject = typingsJapgolly.mdastUtilFindAndReplace.libMod.RegExpMatchObject
  
  type Replace = typingsJapgolly.mdastUtilFindAndReplace.libMod.Replace
  
  type ReplaceFunction = typingsJapgolly.mdastUtilFindAndReplace.libMod.ReplaceFunction
}
