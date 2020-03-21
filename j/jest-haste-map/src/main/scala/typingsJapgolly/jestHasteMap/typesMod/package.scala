package typingsJapgolly.jestHasteMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type DuplicatesIndex = typingsJapgolly.std.Map[
    java.lang.String, 
    typingsJapgolly.std.Map[java.lang.String, typingsJapgolly.jestHasteMap.typesMod.DuplicatesSet]
  ]
  type DuplicatesSet = typingsJapgolly.std.Map[java.lang.String, /* type */ scala.Double]
  type EventsQueue = js.Array[typingsJapgolly.jestHasteMap.AnonFilePath]
  type FileData = typingsJapgolly.std.Map[
    typingsJapgolly.jestTypes.configMod.Path, 
    typingsJapgolly.jestHasteMap.typesMod.FileMetaData
  ]
  type FileMetaData = js.Tuple6[
    java.lang.String, 
    scala.Double, 
    scala.Double, 
    typingsJapgolly.jestHasteMap.jestHasteMapNumbers.`0` | typingsJapgolly.jestHasteMap.jestHasteMapNumbers.`1`, 
    java.lang.String, 
    js.UndefOr[java.lang.String | scala.Null]
  ]
  type HasteRegExp = js.RegExp | (js.Function1[/* str */ java.lang.String, scala.Boolean])
  type IgnoreMatcher = js.Function1[/* item */ java.lang.String, scala.Boolean]
  type Mapper = js.Function1[/* item */ java.lang.String, js.Array[java.lang.String] | scala.Null]
  type MockData = typingsJapgolly.std.Map[java.lang.String, typingsJapgolly.jestTypes.configMod.Path]
  type ModuleMapData = typingsJapgolly.std.Map[java.lang.String, typingsJapgolly.jestHasteMap.typesMod.ModuleMapItem]
  type ModuleMapItem = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.jestHasteMap.typesMod.ModuleMetaData]
  type ModuleMetaData = js.Tuple2[typingsJapgolly.jestTypes.configMod.Path, /* type */ scala.Double]
  type WatchmanClocks = typingsJapgolly.std.Map[typingsJapgolly.jestTypes.configMod.Path, java.lang.String]
}
