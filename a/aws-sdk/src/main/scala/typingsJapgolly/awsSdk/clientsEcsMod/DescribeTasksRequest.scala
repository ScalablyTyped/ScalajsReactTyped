package typingsJapgolly.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTasksRequest extends StObject {
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task or tasks to describe. If you do not specify a cluster, the default cluster is assumed. This parameter is required if the task or tasks you are describing were launched in any cluster other than the default cluster.
    */
  var cluster: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether you want to see the resource tags for the task. If TAGS is specified, the tags are included in the response. If this field is omitted, tags aren't included in the response.
    */
  var include: js.UndefOr[TaskFieldList] = js.undefined
  
  /**
    * A list of up to 100 task IDs or full ARN entries.
    */
  var tasks: StringList
}
object DescribeTasksRequest {
  
  inline def apply(tasks: StringList): DescribeTasksRequest = {
    val __obj = js.Dynamic.literal(tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTasksRequest]
  }
  
  extension [Self <: DescribeTasksRequest](x: Self) {
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setInclude(value: TaskFieldList): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: TaskField*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def setTasks(value: StringList): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksVarargs(value: String*): Self = StObject.set(x, "tasks", js.Array(value*))
  }
}
