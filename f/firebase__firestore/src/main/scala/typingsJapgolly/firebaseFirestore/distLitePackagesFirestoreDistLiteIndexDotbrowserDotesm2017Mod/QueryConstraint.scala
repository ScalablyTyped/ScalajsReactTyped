package typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @license
  * Copyright 2020 Google LLC
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  *   http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */
/**
  * A `QueryConstraint` is used to narrow the set of documents returned by a
  * Firestore query. `QueryConstraint`s are created by invoking {@link where},
  * {@link orderBy}, {@link (startAt:1)}, {@link (startAfter:1)}, {@link
  * endBefore:1}, {@link (endAt:1)}, {@link limit} or {@link limitToLast} and
  * can then be passed to {@link query} to create a new query instance that
  * also contains this `QueryConstraint`.
  */
@JSImport("@firebase/firestore/dist/lite/packages/firestore/dist/lite/index.browser.esm2017", "QueryConstraint")
@js.native
open class QueryConstraint ()
  extends StObject
     with hr
