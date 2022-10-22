package typingsJapgolly.redisInfo.mod

import typingsJapgolly.redisInfo.redisInfoStrings.`32`
import typingsJapgolly.redisInfo.redisInfoStrings.`64`
import typingsJapgolly.redisInfo.redisInfoStrings.cluster
import typingsJapgolly.redisInfo.redisInfoStrings.sentinel
import typingsJapgolly.redisInfo.redisInfoStrings.standalone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerInfo extends StObject {
  
  var arch_bits: `32` | `64`
  
  var atomicvar_api: String
  
  var config_file: String
  
  var executable: String
  
  var gcc_version: String
  
  var hz: String
  
  var lru_clock: String
  
  var multiplexing_api: String
  
  var os: String
  
  var process_id: String
  
  var redis_build_id: String
  
  var redis_git_dirty: Flag
  
  var redis_git_sha1: String
  
  var redis_mode: standalone | sentinel | cluster
  
  var redis_version: String
  
  var run_id: String
  
  var tcp_port: String
  
  var uptime_in_days: String
  
  var uptime_in_seconds: String
}
object ServerInfo {
  
  inline def apply(
    arch_bits: `32` | `64`,
    atomicvar_api: String,
    config_file: String,
    executable: String,
    gcc_version: String,
    hz: String,
    lru_clock: String,
    multiplexing_api: String,
    os: String,
    process_id: String,
    redis_build_id: String,
    redis_git_dirty: Flag,
    redis_git_sha1: String,
    redis_mode: standalone | sentinel | cluster,
    redis_version: String,
    run_id: String,
    tcp_port: String,
    uptime_in_days: String,
    uptime_in_seconds: String
  ): ServerInfo = {
    val __obj = js.Dynamic.literal(arch_bits = arch_bits.asInstanceOf[js.Any], atomicvar_api = atomicvar_api.asInstanceOf[js.Any], config_file = config_file.asInstanceOf[js.Any], executable = executable.asInstanceOf[js.Any], gcc_version = gcc_version.asInstanceOf[js.Any], hz = hz.asInstanceOf[js.Any], lru_clock = lru_clock.asInstanceOf[js.Any], multiplexing_api = multiplexing_api.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], process_id = process_id.asInstanceOf[js.Any], redis_build_id = redis_build_id.asInstanceOf[js.Any], redis_git_dirty = redis_git_dirty.asInstanceOf[js.Any], redis_git_sha1 = redis_git_sha1.asInstanceOf[js.Any], redis_mode = redis_mode.asInstanceOf[js.Any], redis_version = redis_version.asInstanceOf[js.Any], run_id = run_id.asInstanceOf[js.Any], tcp_port = tcp_port.asInstanceOf[js.Any], uptime_in_days = uptime_in_days.asInstanceOf[js.Any], uptime_in_seconds = uptime_in_seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerInfo]
  }
  
  extension [Self <: ServerInfo](x: Self) {
    
    inline def setArch_bits(value: `32` | `64`): Self = StObject.set(x, "arch_bits", value.asInstanceOf[js.Any])
    
    inline def setAtomicvar_api(value: String): Self = StObject.set(x, "atomicvar_api", value.asInstanceOf[js.Any])
    
    inline def setConfig_file(value: String): Self = StObject.set(x, "config_file", value.asInstanceOf[js.Any])
    
    inline def setExecutable(value: String): Self = StObject.set(x, "executable", value.asInstanceOf[js.Any])
    
    inline def setGcc_version(value: String): Self = StObject.set(x, "gcc_version", value.asInstanceOf[js.Any])
    
    inline def setHz(value: String): Self = StObject.set(x, "hz", value.asInstanceOf[js.Any])
    
    inline def setLru_clock(value: String): Self = StObject.set(x, "lru_clock", value.asInstanceOf[js.Any])
    
    inline def setMultiplexing_api(value: String): Self = StObject.set(x, "multiplexing_api", value.asInstanceOf[js.Any])
    
    inline def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setProcess_id(value: String): Self = StObject.set(x, "process_id", value.asInstanceOf[js.Any])
    
    inline def setRedis_build_id(value: String): Self = StObject.set(x, "redis_build_id", value.asInstanceOf[js.Any])
    
    inline def setRedis_git_dirty(value: Flag): Self = StObject.set(x, "redis_git_dirty", value.asInstanceOf[js.Any])
    
    inline def setRedis_git_sha1(value: String): Self = StObject.set(x, "redis_git_sha1", value.asInstanceOf[js.Any])
    
    inline def setRedis_mode(value: standalone | sentinel | cluster): Self = StObject.set(x, "redis_mode", value.asInstanceOf[js.Any])
    
    inline def setRedis_version(value: String): Self = StObject.set(x, "redis_version", value.asInstanceOf[js.Any])
    
    inline def setRun_id(value: String): Self = StObject.set(x, "run_id", value.asInstanceOf[js.Any])
    
    inline def setTcp_port(value: String): Self = StObject.set(x, "tcp_port", value.asInstanceOf[js.Any])
    
    inline def setUptime_in_days(value: String): Self = StObject.set(x, "uptime_in_days", value.asInstanceOf[js.Any])
    
    inline def setUptime_in_seconds(value: String): Self = StObject.set(x, "uptime_in_seconds", value.asInstanceOf[js.Any])
  }
}
